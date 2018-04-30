package app;

import models.Board;
import models.Player;
import models.Turn;

public class Aplication 
{
	private Board board;
	private Player players[];
	private Turn turn;
	
	public Aplication()
	{
		board = new Board();
		players = new  Player[2];
		players[0] = new Player('o');
		players[1] = new Player('x');
		turn = new Turn();
	}
	
	
	public void start() 
	{
		board.show();
		for(int i=0; i<5;i++)
		{
			players[turn.take()].put(board);
			turn.change();
			board.show();
		}
		if(board.isThreeInARow())
		{
			players[turn.notTake()].celebrateVictory();
		}
		else
		{
			players[turn.take()].put(board);
			board.show();
			while(!board.isThreeInARow())
			{
				turn.change();
				players[turn.take()].move(board);
				board.show();
			}
			players[turn.take()].celebrateVictory();
		}
	}
	
	public static void main(String[] args) 
	{
		Aplication app = new Aplication();
		app.start();
	}

	

}
