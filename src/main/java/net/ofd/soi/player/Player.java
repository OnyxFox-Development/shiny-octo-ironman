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

package net.ofd.soi.player;

import net.ofd.soi.error.*;
import net.ofd.soi.util.*;

public class Player
{
	private static String NameRegex = "(?i:[a-z0-9]+)";

	public String name;

	public Player ( String name ) throws InvalidNameException
	{
		if ( ! name.matches( NameRegex ) )
		{
			throw new InvalidNameException( getPlayerName() );
		}
		this.name = name;
	}

	public Player () throws InvalidNameException
	{
		this( UserInputHelper.promptBasic( "Player Name" ) );
	}

	public String getPlayerName ()
	{
		return this.name;
	}
}
