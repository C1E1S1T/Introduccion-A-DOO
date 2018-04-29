package views;

import controllers.AgencyController;

public class AgencyView 
{
	private AgencyController controller;
	private IO io;
	
	public AgencyView(AgencyController controller)
	{
		this.controller = controller;
		io = new IO();
	}
	
	public void interact()
	{	
		int option = 4;
		do
		{
			io.writeln("Menu");
			option = io.readInt("1.Agregar usuario 2. Eliminar usuario 3.Buscar usuario 4. Para salir\n");
			switch(option)
			{
				case 1: addUser();break;
				case 2: deleteUser();break;
				case 3: findUser();break;
				case 4: exit(); break;
			}
		}while(option != 4);
	}

	private void exit() 
	{
		io.writeln("Hasta luego");
	}

	private void findUser() 
	{	
		try 
		{
			io.writeln(controller.actionFindUser(io.readString("Dni de usuario:")).toString());
		} catch (Exception e) 
		{
			io.writeln(e.getMessage());
		}
	}

	private void deleteUser() 
	{
		controller.actionDeleteUser(io.readString("Dni de usuario:"));
	}

	private void addUser() 
	{
		controller.actionAddUser(io.readString("Nombre:"), io.readString("Correo:"), io.readInt("Edad:"), io.readString("Dni:"));	
	}
	
}
