package models;

public abstract class Figure 
{
	private String type;
	
	public Figure(String type)
	{
		this.type=type;
	}
	
	
	public String getType()
	{
		return type;
	}
	
	public abstract Double calculateArea();
	
}
