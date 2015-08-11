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

public class MonsterCard extends Card {
	private Attribute CardAttribute;
	private int Atk = 0;
	private int Def = 0;
	private MonsterCard.Type Type;
	private SecondaryType SecondType;
	private int Level = 0;

	public MonsterCard() {
		super(Card.CardType.MONSTER);
	}

	public Attribute getCardAttribute() {
		return CardAttribute;
	}

	public MonsterCard setCardAttribute(Attribute cardAttribute) {
		CardAttribute = cardAttribute;
		return this;
	}

	public int getAtk() {
		return Atk;
	}

	public MonsterCard setAtk(int atk) {
		Atk = atk;
		return this;
	}

	public int getDef() {
		return Def;
	}

	public MonsterCard setDef(int def) {
		Def = def;
		return this;
	}

	public MonsterCard.Type getType() {
		return Type;
	}

	public MonsterCard setType(MonsterCard.Type type) {
		this.Type = type;
		return this;
	}

	@Override
	public MonsterCard setCardName(String cardName) {
		return (MonsterCard) super.setCardName(cardName);
	}

	public int getLevel() {
		return Level;
	}

	public MonsterCard setLevel(int level) {
		Level = level;
		return this;
	}

	public MonsterCard.SecondaryType getSecondType() {
		return SecondType;
	}

	public MonsterCard setSecondType(MonsterCard.SecondaryType secondType) {
		SecondType = secondType;
		return this;
	}

	public enum Type {
		SPELLCASTER,
		DRAGON,
		ZOMBIE,
		WARRIOR,
		BEASTWARRIOR,
		BEAST,
		WINGEDBEAST,
		FIEND,
		FAIRY,
		INSECT,
		DINOSAUR,
		REPTILE,
		FISH,
		SEASERPENT,
		AQUA,
		PYRO,
		THUNDER,
		ROCK,
		PLANT,
		MACHINE,
		PSYCHIC,
		DIVINEBEAST,
	}

	public enum SecondaryType {
		NORMAL,
		EFFECT,
		RITUAL,
		FUSION,
		SYNCHRO,
		XYZ,
		TOON,
		SPIRIT,
		UNION,
		GEMINI,
		TUNER,
		FLIP,
	}
}
