package models;

public class Coordinate 
{
	private int row;
	private int column;

	public Coordinate()
	{
		this.row = 0;
		this.column = 0;
	}

	public void select(String string) 
	{
		IO io = new IO();
		row = io.readInt("Ingrese fila: ");
		column = io.readInt("Ingrese columna: ");
	}

	public boolean isValid() 
	{
		return row>=0 && row<=2 && column>=0 && column<=3;
	}

	public int getRow() 
	{
		return row;
	}

	public int getColumn() 
	{
		return column;
	}

}
