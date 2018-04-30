package models;

public class Turn 
{
	private int value;
	
	public Turn()
	{
		value = 0;
	}
	
	public int take() 
	{
		return value;
	}

	public void change() 
	{
		value = (value + 1) % 2;
	}

	public int notTake() 
	{
		return (value + 1) % 2;
	}

}
