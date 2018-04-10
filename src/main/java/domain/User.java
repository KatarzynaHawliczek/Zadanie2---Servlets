package domain;

public class User 
{
	
	private String username;
	private String password;
	private String email;
	private String permission;
	
	public User(String username, String password, String email, String permission)
	{
		this.username = username;
		this.password = password;
		this.email = email;
		this.permission = permission;
	}

	public User()
	{
	
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getEmail()
    {
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPermission() 
	{
		return permission;
	}

	public void setPermission(String permission) 
	{
		this.permission = permission;
	}

}
