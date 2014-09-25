package net.ofd.soi.util;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;

public class CLIHelper
{
	public static void print(String text, boolean newline)
	{
		if (newline)
		{
			System.out.println(text);
		}
		else
		{
			System.out.print(text);
		}
	}
	
	public static void print(String text)
	{
		print(text, true);
	}
	
	public static int getConsoleWidth()
	{
		String line;
		String out = "-1";
		try
		{
			Process process = Runtime.getRuntime().exec(new String[] {"bash", "-c", "tput cols 2> /dev/tty" });
			OutputStream stdin = process.getOutputStream ();
			InputStream stderr = process.getErrorStream ();
			InputStream stdout = process.getInputStream ();
			
			BufferedReader reader = new BufferedReader (new InputStreamReader(stdout));
			while ((line = reader.readLine ()) != null) {
				out = line;
			}
			return Integer.parseInt(out);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}
	
	public static int getConsoleHeight()
	{
		String line;
		String out = "-1";
		try
		{
			Process process = Runtime.getRuntime().exec(new String[] {"bash", "-c", "tput lines 2> /dev/tty" });
			OutputStream stdin = process.getOutputStream ();
			InputStream stderr = process.getErrorStream ();
			InputStream stdout = process.getInputStream ();
			
			BufferedReader reader = new BufferedReader (new InputStreamReader(stdout));
			while ((line = reader.readLine ()) != null) {
				out = line;
			}
			return Integer.parseInt(out);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}
}
