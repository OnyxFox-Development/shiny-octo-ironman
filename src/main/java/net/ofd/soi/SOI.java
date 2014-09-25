package net.ofd.soi;

import net.ofd.soi.util.*;

public class SOI
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 50; i++)
		{
			CLIHelper.print("Width: " + String.valueOf(CLIHelper.getConsoleWidth()));
			CLIHelper.print("Height: " + String.valueOf(CLIHelper.getConsoleHeight()));
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
