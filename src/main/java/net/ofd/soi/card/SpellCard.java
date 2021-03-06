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

public class SpellCard extends Card {
	private Type CardSpellType;

	public SpellCard() {
		super(Card.CardType.SPELL);
	}

	@Override
	public SpellCard setCardName(String cardName) {
		return (SpellCard) super.setCardName(cardName);
	}

	public SpellCard.Type getCardSpellType() {
		return CardSpellType;
	}

	public SpellCard setCardSpellType(Type cardSpellType) {
		CardSpellType = cardSpellType;
		return this;
	}

	public enum Type {
		NORMAL,
		CONTINUOUS,
		EQUIP,
		QUICKPLAY,
		FIELD,
		RITUAL,
	}
}
