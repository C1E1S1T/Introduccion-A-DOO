package models.inheritance;

public class CB <N extends Number> extends CA<N>
{
	private N z;

	public CB(N x, N y, N z) 
	{
		super(x, y);
		this.z = z;
	}

	@SuppressWarnings("unchecked")
	public N add()
	{
		return (N) (Double)(super.add().doubleValue() + getZ());
	}
	
	@SuppressWarnings("unchecked")
	public N multiply()
	{
		return (N) (Double)(super.add().doubleValue() * getZ());
	}
	
	@SuppressWarnings("unchecked")
	public N findBiggerNumber()
	{
		Double result = Double.max(super.findBiggerNumber().doubleValue(), getZ());
		return (N) result;
	}
	
	public Double getZ() 
	{
		return z.doubleValue();
	}
	
}
