package net.ofd.soi.util;

import java.util.Scanner;

public class UserInputHelper
{
	public static String promptBasic ( String text )
	{
		Scanner s = new Scanner( System.in );
		CLIHelper.print( text + ": " );
		return s.next();
	}
}
