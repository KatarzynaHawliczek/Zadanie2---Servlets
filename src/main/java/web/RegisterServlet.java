package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import repositories.UserRepository;


@WebServlet("/")
public class RegisterServlet extends HttpServlet 
{

	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
			
		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    String confirmpassword = request.getParameter("confirmpassword");
	    String email = request.getParameter("email");
	    
	    if(username==null || password==null || confirmpassword==null || email==null)
	    {
	    	response.sendRedirect("register.jsp");
	    }
	    else if(username.equals("") || password.equals("") || confirmpassword.equals("") || email.equals(""))
	    {
	    	response.sendRedirect("register.jsp");
	    }
	    else if(!(password.equals(confirmpassword)))
	    {
	    	response.sendRedirect("register.jsp");
	    }
	    else
	    {
	    	User u = new User();
	        u.setUsername(username);
	        u.setPassword(password);
	        u.setEmail(email);
	        u.setPermission("common");
	        
	        UserRepository repository = new UserRepository();
	        if(repository.count()==0)
	        {
	        	User admin = new User("admin", "admin", "admin@page.com", "admin");
	        	repository.add(admin);
	        }
	        
	        repository.add(u);
	        response.sendRedirect("login.jsp");
	    }  
	}
 
}
