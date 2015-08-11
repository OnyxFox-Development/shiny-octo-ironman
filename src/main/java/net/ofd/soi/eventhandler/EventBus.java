package net.ofd.soi.eventhandler;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.MapMaker;
import com.google.common.reflect.TypeToken;

import javax.annotation.Nonnull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class EventBus implements IEventExceptionHandler {
	private static int maxID = 0;
	private final int busID = maxID++;
	private ConcurrentHashMap<Object, ArrayList<IEventListener>> listeners = new ConcurrentHashMap<Object, ArrayList<IEventListener>>();
	private Map<Object, Object> listenerOwners = new MapMaker().weakKeys().weakValues().makeMap();
	private IEventExceptionHandler exceptionHandler;

	public EventBus() {
		ListenerList.resize(busID + 1);
		exceptionHandler = this;
	}

	public EventBus(@Nonnull IEventExceptionHandler handler) {
		this();
		Preconditions.checkArgument(handler != null, "EventBus exception handler can not be null");
		exceptionHandler = handler;
	}

	public void register(Object target) {
		if (listeners.containsKey(target)) {
			return;
		}

		Set<? extends Class<?>> supers = TypeToken.of(target.getClass()).getTypes().rawTypes();
		for (Method method : target.getClass().getMethods()) {
			for (Class<?> cls : supers) {
				try {
					Method real = cls.getDeclaredMethod(method.getName(), method.getParameterTypes());
					if (real.isAnnotationPresent(SubscribeEvent.class)) {
						Class<?>[] parameterTypes = method.getParameterTypes();
						if (parameterTypes.length != 1) {
							throw new IllegalArgumentException(
									"Method " + method + " has @SubscribeEvent annotation, but requires " + parameterTypes.length +
											" arguments.  Event handler methods must require a single argument."
							);
						}

						Class<?> eventType = parameterTypes[0];

						if (!Event.class.isAssignableFrom(eventType)) {
							throw new IllegalArgumentException("Method " + method + " has @SubscribeEvent annotation, but takes a argument that is not an Event " + eventType);
						}

						register(eventType, target, real);
						break;
					}
				} catch (NoSuchMethodException ignored) {

				}
			}
		}
	}

	private void register(Class<?> eventType, Object target, Method method) {
		try {
			Constructor<?> ctr = eventType.getConstructor();
			ctr.setAccessible(true);
			Event event = (Event) ctr.newInstance();

			ArrayList<IEventListener> others = listeners.get(target);
			if (others == null) {
				others = new ArrayList<IEventListener>();
				listeners.put(target, others);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unregister(Object object) {
		ArrayList<IEventListener> list = listeners.remove(object);
		for (IEventListener listener : list) {
			ListenerList.unregisterAll(busID, listener);
		}
	}

	public boolean post(Event event) {
		IEventListener[] listeners = event.getListenerList().getListeners(busID);
		int index = 0;
		try {
			for (; index < listeners.length; index++) {
				listeners[index].invoke(event);
			}
		} catch (Throwable throwable) {
			exceptionHandler.handleException(this, event, listeners, index, throwable);
			Throwables.propagate(throwable);
		}
		return (event.isCancelable() && event.isCanceled());
	}

	@Override
	public void handleException(EventBus bus, Event event, IEventListener[] listeners, int index, Throwable throwable) {

	}
}
