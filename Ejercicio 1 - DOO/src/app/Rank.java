package app;

public class Rank 
{
	private Double value;
	private Double upperLimit;

	public Rank(Double upperLimit, Double value) 
	{
		this.upperLimit = upperLimit;
		this.setValue(value);
	}
	
	public Rank()
	{
		this(0.0,0.0);
	}
	
	public void setValue(Double value) 
	{
		if(value <= upperLimit)
		{
			this.value = value;
		}
		else
		{
			this.value = upperLimit; 		
		}
	}

	public Double reset() 
	{
		setValue(0.0);
		return value;
	}
}
