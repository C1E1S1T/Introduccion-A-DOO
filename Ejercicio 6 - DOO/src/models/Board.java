package models;

public class Board 
{
	private char [][] pieces = new char[3][3];
	private char symbolVacy = '-'; 
	
	public Board()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3;j++)
			{
				pieces[i][j] = symbolVacy;
			}
		}
	}
	
	public void show()
	{
		System.out.println();
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(pieces[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}
	

	public boolean isThreeInARow() 
	{
		return isThreeInARow('x') || isThreeInARow('o');
	}

	private boolean isThreeInARow(char color) 
	{
		boolean victory = false;
		int diagonal = 0;
		int inverseDiagonal = 0;
		int rows[] = new int[3];
		int columns[] = new int[3];
		
		for(int i=0; i<3; i++)
		{
			rows[i] = 0;
			columns[i] = 0;
			for(int j=0; j<3; j++)
			{
				if( pieces[i][j] == color )
				{
					if(i == j)
					{
						diagonal++;
					}
					if(i+j == 2)
					{
						inverseDiagonal++;
					}
					rows[i]++;
					columns[j]++;
				}
			}
		}
		
		if( (diagonal == 3) || (inverseDiagonal == 3)  )
		{
			victory = true;
		}
		else
		{
			for(  int i=0; i<3; i++  )
			{
				if(  (columns[i]  == 3) || (rows[i] == 3) )
				{
					victory = true;
				}
			}
		}
		return victory;
	}
	
	public boolean isOccupied(Coordinate coordinate)
	{
		return pieces[coordinate.getRow()][coordinate.getColumn()] != symbolVacy;
	}
	
	public void put(Coordinate coordinate, char color)
	{
		pieces[coordinate.getRow()][coordinate.getColumn()] = color;
	}
	
	public void emptyCoordinate(Coordinate coordinate)
	{
		put(coordinate, symbolVacy);
	}
	
	
}
