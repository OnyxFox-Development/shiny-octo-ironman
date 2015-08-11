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

package net.ofd.soi.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CliHelper {
	public static void print(String text, boolean newline) {
		if (newline) {
			System.out.println(text);
		} else {
			System.out.print(text);
		}
	}

	public static void print(String text) {
		print(text, true);
	}

	public static int getConsoleWidth() {
		String line;
		String out = "-1";
		try {
			Process process = Runtime.getRuntime().exec(new String[]{"bash", "-c", "tput cols 2> /dev/tty"});
			OutputStream stdin = process.getOutputStream();
			InputStream stderr = process.getErrorStream();
			InputStream stdout = process.getInputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
			while ((line = reader.readLine()) != null) {
				out = line;
			}
			return Integer.parseInt(out);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static int getConsoleHeight() {
		String line;
		String out = "-1";
		try {
			Process process = Runtime.getRuntime().exec(new String[]{"bash", "-c", "tput lines 2> /dev/tty"});
			OutputStream stdin = process.getOutputStream();
			InputStream stderr = process.getErrorStream();
			InputStream stdout = process.getInputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
			while ((line = reader.readLine()) != null) {
				out = line;
			}
			return Integer.parseInt(out);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
