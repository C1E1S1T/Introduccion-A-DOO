package app;

import controllers.AgencyController;
import views.AgencyView;

public class Aplication 
{

	public static void main(String[] args) 
	{
		Aplication app = new Aplication();
		app.start();
	}

	private void start() 
	{
		AgencyView view = new AgencyView(new AgencyController());
		view.interact();
	}

	
	
}
