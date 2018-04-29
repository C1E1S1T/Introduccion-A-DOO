package exeptions;

public class ExceptionFindUser extends Exception 
{
	private static final long serialVersionUID = -7975575028231280093L;

	public ExceptionFindUser()
	{
		super("Error al buscar usuario");
	}
	
	public ExceptionFindUser(String msg)
	{
		super(msg);
	}
	
}
