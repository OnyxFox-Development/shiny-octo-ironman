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

package net.ofd.soi.cli;

public class Dimension
{
	private int[] Dimensions = new int[] { };

	public Dimension ( int width, int height )
	{
		Dimensions[ 0 ] = width;
		Dimensions[ 1 ] = height;
	}

	public int[] getDimensions ()
	{
		return Dimensions;
	}

	public int[] setDimensions ( int width, int height )
	{
		Dimensions[ 0 ] = width;
		Dimensions[ 1 ] = height;
		return Dimensions;
	}

	public int getWidth ()
	{
		return getDimensions()[ 0 ];
	}

	public void setWidth ( int width )
	{
		setDimensions( width, getHeight() );
	}

	public int getHeight ()
	{
		return getDimensions()[ 1 ];
	}

	public void setHeight ( int height )
	{
		setDimensions( getWidth(), height );
	}
}
