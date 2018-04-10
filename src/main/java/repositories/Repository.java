package repositories;

import domain.User;

public interface Repository
{
	
	public void add(User user);
	public void setPermissionByAdmin(String username, String permission);
	public Object getAll();
	public boolean exists(String username);
	User getUserByUsername(String username);
	int count();

}
