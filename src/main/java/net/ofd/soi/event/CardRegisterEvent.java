package net.ofd.soi.event;

import net.ofd.soi.card.Card;
import net.ofd.soi.eventhandler.Event;

public class CardRegisterEvent extends Event {
	public String unlocalizedCardName;
	public Card card;

	public CardRegisterEvent(String unlocalizedCardName, Card card) {
		super();
		this.unlocalizedCardName = unlocalizedCardName;
		this.card = card;
	}
}
