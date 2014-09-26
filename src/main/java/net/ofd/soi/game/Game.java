/*
 * Copyright (c) 2014. OnyxFox Development
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
import net.ofd.soi.util.CliHelper;
import net.ofd.soi.util.UserInputHelper;

public class Game
{


	public Game ()
	{
		try
		{
			String player1Name = UserInputHelper.promptBasic( "Player 1 Name" );
			PlayerRegistry.addPlayer( player1Name );
		}
		catch ( InvalidNameException e )
		{
			CliHelper.print( "Invalid characters in name " + e.Name );
		}
		try
		{
			String player2Name = UserInputHelper.promptBasic( "Player 2 Name" );
			PlayerRegistry.addPlayer( player2Name );
		}
		catch ( InvalidNameException e )
		{
			CliHelper.print( "Invalid characters in name " + e.Name );

		}
	}
	public void start ()
	{

	}
}
