package controllers;

import exeptions.ExceptionFindUser;
import models.Agency;
import models.User;

public class AgencyController 
{
	private Agency agency;
	
	public AgencyController()
	{
		agency = new Agency();
	}
	
	public void actionAddUser(String name, String email, Integer age, String dni)
	{
		agency.addUser(new User(name, email, age, dni));
	}
	
	public void actionDeleteUser(String dni)
	{
		agency.deleteUser(dni);
	}
	
	public User actionFindUser(String dni) throws Exception
	{
		if(agency.findUser(dni) != null)
		{
			return agency.findUser(dni);
		}
		throw new ExceptionFindUser(); 
	}
	
}
