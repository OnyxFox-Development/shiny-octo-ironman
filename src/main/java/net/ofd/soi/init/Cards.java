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

package net.ofd.soi.init;

import net.ofd.soi.card.Attribute;
import net.ofd.soi.card.Card;
import net.ofd.soi.card.MonsterCard;
import net.ofd.soi.card.SpellCard;
import net.ofd.soi.game.CardRegistry;
import net.ofd.soi.reference.Files;
import net.ofd.soi.util.DataFileHelper;

import java.util.Map;

public class Cards {
	//Card list obtained from: http://www.db.yugioh-card.com/yugiohdb/card_search.action?ope=1&sess=2&sort=1&rp=100&page=1
	//Spell Cards
	public static final SpellCard aCellBreedingDevice = new SpellCard().setCardName("aCellBreedingDevice").setCardSpellType(SpellCard.Type.CONTINUOUS);

	//Trap Cards


	//Monster Cards
	public static final MonsterCard threeHumpLacooda = new MonsterCard().setCardName("threeHumpLacooda").setAtk(500).setDef(1500).setLevel(3).setCardAttribute(Attribute.EARTH).setType(MonsterCard.Type.BEAST).setSecondType(MonsterCard.SecondaryType.EFFECT);

	public static void init() {
		CardRegistry.registerCard("aCellBreedingDevice", aCellBreedingDevice);
		CardRegistry.registerCard("threeHumpLacooda", threeHumpLacooda);
	}

	public static void initCustomCards() {
		for (Map.Entry<String, Card> card : DataFileHelper.readCardDataFromJsonFile(Files.customCardJson).entrySet()) {
			CardRegistry.registerCustomCard(card.getKey(), card.getValue());
		}
	}
}
