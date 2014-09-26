package net.ofd.soi.game;

import net.ofd.soi.error.InvalidNameException;
import net.ofd.soi.util.UserInputHelper;

import java.util.ArrayList;

public class Game
{
	public ArrayList< String > playerNames = new ArrayList<>();
	public String nameRegex = "(?i:[a-z0-9]+)";

	public Game ()
	{
		try
		{
			String player1Name = UserInputHelper.promptBasic( "Player 1 Name" );
			if ( ! player1Name.matches( nameRegex ) )
			{
				throw new InvalidNameException( player1Name);
			}
			String player2Name = UserInputHelper.promptBasic( "Player 2 Name" );
			if ( ! player2Name.matches( nameRegex ) )
			{
				throw new InvalidNameException( player2Name );
			}
			playerNames.add( player1Name );
			playerNames.add( player2Name );
		}
		catch ( InvalidNameException e )
		{
			e.printStackTrace();
			System.exit( 1 );
		}
	}

	public void start ()
	{

	}
}
