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

import net.ofd.soi.card.Card;

import java.util.HashMap;
import java.util.Map;

public class CardRegistry
{
	private static Map< String, Card > Cards = new HashMap<>();

	public static void registerCard ( String unlocalizedCardName, Card card )
	{
		Cards.put( unlocalizedCardName, card );
	}
}
