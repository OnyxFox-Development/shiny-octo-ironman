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

import net.ofd.soi.error.InvalidNameException;
import net.ofd.soi.player.Player;

import java.util.ArrayList;

public class PlayerRegistry {
	private static ArrayList<Player> Players = new ArrayList<>();

	public static void registerPlayer(Player player, int playerId) {
		Players.add(playerId, player);
	}

	public static void registerPlayer(Player player) throws InvalidNameException {
		registerPlayer(player, getGloballyUniquePlayerId());
	}

	public static int getGloballyUniquePlayerId() {
		return Players.size();
	}
}
