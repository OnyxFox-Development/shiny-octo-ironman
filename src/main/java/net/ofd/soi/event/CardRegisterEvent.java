package net.ofd.soi.event;

import net.ofd.soi.card.Card;
import net.ofd.soi.eventhandler.Event;

public class CardRegisterEvent extends Event {
	public Card card;

	public CardRegisterEvent(Card card) {
		super();
		this.card = card;
	}
}
