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

public class Cli {
	private static Dimension Size;
	private static String Title;

	public Cli(int width, int height) {
		setSize(new Dimension(width, height));
	}

	public static Dimension getSize() {
		return Size;
	}

	public static Dimension setSize(Dimension size) {
		Size = size;
		return Size;
	}

	public static String getTitle() {
		return Title;
	}

	public static String setTitle(String title) {
		Title = title;
		return Title;
	}
}
