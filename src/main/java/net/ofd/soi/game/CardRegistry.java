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

package net.ofd.soi.game;

import net.ofd.soi.SOI;
import net.ofd.soi.card.Card;
import net.ofd.soi.event.CardRegisterEvent;
import net.ofd.soi.reference.Files;
import net.ofd.soi.util.DataFileHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardRegistry {
	private static Map<String, Card> Cards = new HashMap<>();
	private static Map<String, Card> CustomCards = new HashMap<>();

	public static Map<String, Card> getCustomCards() {
		return CustomCards;
	}

	public static void registerCard(String unlocalizedCardName, Card card) {
		if (!SOI.EVENT_BUS.post(new CardRegisterEvent(unlocalizedCardName, card))) {
			Cards.put(unlocalizedCardName, card);
		}
	}

	public static void registerCustomCard(String unlocalizedCardName, Card card) {
		CustomCards.put(unlocalizedCardName, card);
		registerCard(unlocalizedCardName, card);
		DataFileHelper.writeCardDataToJsonFile(Files.customCardJson);
	}

	public static Card[] getCardsByType(Card.CardType cardType) {
		List<Card> out = new ArrayList<>();
		for (Map.Entry<String, Card> card : Cards.entrySet()) {
			if (card.getValue().getCardType().equals(cardType)) {
				out.add(card.getValue());
			}
		}
		return out.toArray(new Card[out.size()]);
	}

	public static Card getCardByName(String name) {
		return Cards.get(name);
	}
}
