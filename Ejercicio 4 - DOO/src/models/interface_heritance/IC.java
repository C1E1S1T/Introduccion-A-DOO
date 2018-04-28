package models.interface_heritance;

public interface IC<N extends Number> extends IA<N>, IB<N> 
{
	public N findBiggerNumber();
}
