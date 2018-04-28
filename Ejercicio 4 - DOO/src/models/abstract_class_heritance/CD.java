package models.abstract_class_heritance;

public class CD extends CC 
{

	private Double x;
	private Double y;

	public CD(Double x, Double y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Double add() 
	{
		return x+y;
	}

}
