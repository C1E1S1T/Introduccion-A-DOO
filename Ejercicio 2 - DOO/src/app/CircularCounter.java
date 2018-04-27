package app;

public class CircularCounter 
{
	private int upperLimit;
	private int counter;

	public CircularCounter(int upperLimit) 
	{
		this.upperLimit = upperLimit;
		setCounter(0);
	}
	
	public void increase() 
	{
		int increment = 1;
		setCounter(counter + increment);
	}

	public void reset() 
	{
		this.counter = -1;
	}

	public void setCounter(int newCounter) 
	{
		if(newCounter<=upperLimit)
		{
			this.counter = newCounter;
		}
		else 
		{
			reset();
		}	
	}

	public Integer getCounter() 
	{
		return counter;
	}
	
}
