package models;

public class Triangle extends Figure {

	private Double base;
	private Double height;


	public Triangle(String type, Double base, Double height) 
	{
		super(type);
		setBase(base);
		setHeight(height);
	}

	public void setBase(Double base) 
	{
		if(base >= 0)
		{
			this.base = base;
		}
	}
	
	public void setHeight(Double height) 
	{
		if(height >= 0)
		{
			this.height = height;
		}
	}


	@Override
	public Double calculateArea() 
	{
		return (height*base)/2;
	}

}
