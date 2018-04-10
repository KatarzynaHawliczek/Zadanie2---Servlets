package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserRepository implements Repository
{
    
	private static List<User> db = new ArrayList<User>();
	
	@Override
	public void setPermissionByAdmin(String username, String permission)
	{
		for(User user: db)
		{
			if(user.getUsername().equalsIgnoreCase(username))
			{
				user.setPermission(permission);
			}
		}
	}

	@Override
	public void add(User user)
	{
		db.add(user);
	}

	@Override
	public int count() 
	{	
		return db.size();
	}

	@Override
	
	public List<User> getAll() 
	{
		return db;
	}

	@Override
	public boolean exists(String username) 
	{
		for(User user: db)
		{
			if(user.getUsername().equalsIgnoreCase(username))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public User getUserByUsername(String username) 
	{
		for(User user: db)
		{
			if(user.getUsername().equalsIgnoreCase(username))
			{
				return user;
			}
		}
		return null;
	}

}
