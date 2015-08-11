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

package net.ofd.soi;

import com.google.gson.Gson;
import net.ofd.soi.eventhandler.EventBus;
import net.ofd.soi.game.Game;
import net.ofd.soi.init.Cards;

public class SOI {
	public static EventBus EVENT_BUS = new EventBus();
	public static Gson gson = new Gson();

	public static void main(String[] args) {
		Cards.init();
		Cards.initCustomCards();
		Game game = new Game();
		game.start();
	}
}