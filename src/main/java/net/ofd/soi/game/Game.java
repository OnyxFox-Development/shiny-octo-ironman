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

import net.ofd.soi.error.*;
import net.ofd.soi.player.*;
import net.ofd.soi.util.*;

public class Game
{
	public Game ()
	{
		while ( true )
		{
			try
			{
				Player player1 = new Player();
				Player player2 = new Player();
				PlayerRegistry.registerPlayer( player1 );
				PlayerRegistry.registerPlayer( player2 );
				break;
			}
			catch ( InvalidNameException e )
			{
				CliHelper.print( String.format( "Invalid characters in name '%s'", e.Name ) );
			}
		}

	}

	public void start ()
	{

	}
}
