package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import repositories.UserRepository;

@WebServlet("/permission")
public class PermissionServlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String username = request.getParameter("username");
		String permission = request.getParameter("permission");
	    
	    UserRepository repository = new UserRepository();  
	    List<User> users = repository.getAll();
	    
	    if(username==null || permission==null)
	    {
	    	response.sendRedirect("permission.jsp");	 
	    }
	    else if(username.equals("") || permission.equals(""))
	    {
	    	response.sendRedirect("permission.jsp");
	    }
	    else 
	    {
	    	for(User u: users)
	    	{
	    		if(u.getUsername().equalsIgnoreCase(username))
	    		{
	    			repository.setPermissionByAdmin(username, permission);
	    			response.sendRedirect("welcome.jsp");
	    		}
	    	}
	    }
	}

}
