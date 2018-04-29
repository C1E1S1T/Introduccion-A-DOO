package models;

import java.util.HashSet;
import java.util.Set;

public class Agency 
{
	private Set<User> users;
	
	public Agency()
	{
		users = new HashSet<>();
	}
	
	public boolean addUser(User user)
	{
		return users.add(user);
	}

	public boolean deleteUser(User user)
	{
		return users.remove(user);	
	}
	
	public boolean deleteUser(String dni)
	{
		return users.removeIf((user) -> dni.equals(user.getDni()));
	}
	
	public User findUser(String dni)
	{
		return users.stream()
					.filter( (user) -> dni.equals(user.getDni()))
					.findAny()
					.orElse(null);
	}

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Agency [users=");
		builder.append(users);
		builder.append("]");
		return builder.toString();
	}
}

