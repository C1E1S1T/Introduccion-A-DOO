package models.inheritance;

import models.interface_heritance.IC;

public class CA <N extends Number> implements IC<N>, Comparable<Object>
{
	private N x;
	private N y;

	public CA(N x, N y)
	{
		this.x = x;
		this.y = y;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public N add() 
	{
		return (N) (Double)(getX()+getY());
	}

	@SuppressWarnings("unchecked")
	@Override
	public N multiply() 
	{
		return (N) (Double)(getX() *  getY());
	}

	@SuppressWarnings("unchecked")
	@Override
	public N findBiggerNumber() 
	{
		return (N) (Double)(Double.max(getX(), getY()));
	}

	public Double getX() 
	{
		return x.doubleValue();
	}
	
	public Double getY() 
	{
		return y.doubleValue();
	}

	@Override
	public int compareTo(Object o) 
	{
		return 0;
	}
	
}
