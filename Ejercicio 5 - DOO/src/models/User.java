package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User 
{
	private String dni;
	private Integer age;
	private String email;
	private String name;

	public User(String name, String email, Integer age, String dni)
	{
		setName(name);
		setEmail(email);
		setAge(age);
		setDni(dni);
	}

	public void setDni(String dni) 
	{
		this.dni=dni;
	}

	public void setAge(Integer yearsOld) 
	{
		this.age = validateAge(yearsOld);
	}
	
	private Integer validateAge(Integer age)
	{
		Integer minimumAge = 0;
		Integer maximumAge = 150;
		return (age>=minimumAge && age<=maximumAge) ? age : null; 
	}
	
	public void setEmail(String email) 
	{
		this.email = validateEmail(email);
	}

	private String validateEmail(String email) 
	{
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
		{
			return email;
		}
		return null;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
			return true;
		}
		if (obj == null) 
		{
			return false;
		}
		if (!(obj instanceof User)) 
		{
			return false;
		}
		User other = (User) obj;
		if (dni == null) 
		{
			if (other.dni != null) 
			{
				return false;
			}
		} else if (!dni.equals(other.dni)) 
		{
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [dni=");
		builder.append(dni);
		builder.append(", yearsOld=");
		builder.append(age);
		builder.append(", email=");
		builder.append(email);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public String getDni() 
	{
		return dni;
	}
	
	
}
