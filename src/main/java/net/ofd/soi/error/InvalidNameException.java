package net.ofd.soi.error;

public class InvalidNameException extends Exception
{
	public InvalidNameException ( String s )
	{
		super( String.format("Name '%s' contains invalid characters", s) );
	}
}
