package views;

import models.Figure;

public class FigureView 
{
	
	public void interact(Figure figure)
	{
		System.out.println("Tipo: "+figure.getType());
		System.out.println("Area: "+figure.calculateArea());
	}
	

}
