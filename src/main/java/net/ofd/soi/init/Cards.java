/*
 * Copyright (c) 2014 OnyxFox Development
 *
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

import net.ofd.soi.card.*;

public class Cards
{
	//Card list obtained from: http://www.db.yugioh-card.com/yugiohdb/card_search.action?ope=1&sess=2&sort=1&rp=100&page=1
	//Spell Cards
	public static SpellCard aCellBreedingDevice = new SpellCard().setCardName( "aCellBreedingDevice" ).setCardSpellType( SpellType.CONTINUOUS );

	//Trap Cards


	//Monster Cards
	public static MonsterCard threeHumpLacooda = new MonsterCard().setCardName( "threeHumpLacooda" ).setAtk( 500 ).setDef( 1500 ).setLevel( 3 ).setCardAttribute( Attribute.EARTH ).setType( MonsterType.BEAST ).setSecondType( SecondaryMonsterType.EFFECT );

}
