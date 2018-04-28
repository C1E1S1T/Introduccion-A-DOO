package models;

public class Square extends Figure 
{

	private Double side;

	public Square(String type, Double side) 
	{
		super(type);
		setSide(side);
	}
	
	public void setSide(Double side) 
	{
		if(side >= 0)
		{
			this.side = side;
		}
	}

	@Override
	public Double calculateArea() 
	{
		return side * side;
	}

}
