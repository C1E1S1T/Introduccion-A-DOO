package app;

import models.Square;
import models.Triangle;
import views.FigureView;

public class Aplication 
{

	public static void main(String[] args) 
	{
		Aplication app = new Aplication();
		app.start();
	}

	private void start() 
	{
		FigureView figureView = new FigureView();
		figureView.interact(new Square("Cuadrado",4.0));
		figureView.interact(new Triangle("Triangulo",3.0,2.0));
	}

}
