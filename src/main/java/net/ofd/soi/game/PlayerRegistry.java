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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayerRegistry
{
	private static ArrayList< Map< String, Object > > Players = new ArrayList<>();
	private static String NameRegex = "(?i:[a-z0-9]+)";

	public static void addPlayer ( String playerName, int playerId ) throws InvalidNameException
	{
		if ( ! playerName.matches( NameRegex ) )
		{
			throw new InvalidNameException( playerName );
		}
		setPlayerProperty( playerId, "playerName", playerName );
	}

	public static void addPlayer ( String playerName ) throws InvalidNameException
	{
		addPlayer( playerName, getGloballyUniquePlayerId() );
	}

	public static int getGloballyUniquePlayerId ()
	{
		return Players.size();
	}

	public static void setPlayerProperty ( int playerId, String key, Object value )
	{
		if ( Players.get( playerId ) == null )
		{
			Players.add( playerId, new HashMap< String, Object >() );
		}
		Players.get( playerId ).put( key, value );
	}

	public static void addPlayers ( String... playerNames ) throws InvalidNameException
	{
		for ( String playerName : playerNames )
		{
			addPlayer( playerName );
		}
	}
}
