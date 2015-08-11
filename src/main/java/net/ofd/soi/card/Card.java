/*
 * Copyright (c) 2015. OnyxFox Development
 * This file is part of SOI.
 *
 * SOI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SOI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SOI.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.ofd.soi.card;

public class Card {
	private String CardName = "card.null.name";
	private CardType cardType = CardType.NONE;

	public Card() {
	}

	public Card(CardType type) {
		this.cardType = type;
	}


	public String getCardName() {
		return CardName;
	}

	public Card setCardName(String cardName) {
		CardName = cardName;
		return this;
	}

	public CardType getCardType() {
		return cardType;
	}

	public enum CardType {
		NONE(Card.class),
		MONSTER(MonsterCard.class),
		SPELL(SpellCard.class),
		TRAP(TrapCard.class);

		private Class<? extends Card> cardClass;

		CardType(Class<? extends Card> card) {

			cardClass = card;
		}

		public Class<? extends Card> getCardClass() {
			return cardClass;
		}
	}
}
