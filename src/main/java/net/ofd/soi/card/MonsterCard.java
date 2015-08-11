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

public class MonsterCard extends Card
{
	private Attribute CardAttribute;
	private int Atk = 0;
	private int Def = 0;
	private MonsterType Type;
	private SecondaryMonsterType SecondType;
	private int Level = 0;

	public MonsterCard ()
	{
		super();
	}

	public Attribute getCardAttribute ()
	{
		return CardAttribute;
	}

	public MonsterCard setCardAttribute ( Attribute cardAttribute )
	{
		CardAttribute = cardAttribute;
		return this;
	}

	public int getAtk ()
	{
		return Atk;
	}

	public MonsterCard setAtk ( int atk )
	{
		Atk = atk;
		return this;
	}

	public int getDef ()
	{
		return Def;
	}

	public MonsterCard setDef ( int def )
	{
		Def = def;
		return this;
	}

	public MonsterType getType ()
	{
		return Type;
	}

	public MonsterCard setType ( MonsterType type )
	{
		this.Type = type;
		return this;
	}

	@Override
	public MonsterCard setCardName ( String cardName )
	{
		return ( MonsterCard ) super.setCardName( cardName );
	}

	public int getLevel ()
	{
		return Level;
	}

	public MonsterCard setLevel ( int level )
	{
		Level = level;
		return this;
	}

	public SecondaryMonsterType getSecondType ()
	{
		return SecondType;
	}

	public MonsterCard setSecondType ( SecondaryMonsterType secondType )
	{
		SecondType = secondType;
		return this;
	}
}
