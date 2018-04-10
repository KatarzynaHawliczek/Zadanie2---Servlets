package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import repositories.UserRepository;
 
@WebServlet("/login")
public class LoginServlet extends HttpServlet 
{

	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    UserRepository repository = new UserRepository();  
	    List<User> users = repository.getAll();
	    	    
	    if(username==null || password==null)
	    {
	    	response.sendRedirect("login.jsp");	 
	    }
	    else if(username.equals("") || password.equals(""))
	    {
	    	response.sendRedirect("login.jsp");	    	
	    }
	    else
	    {
	    	for(User u: users)
		    {
		    	if(u.getUsername().equals(username) && u.getPassword().equals(password))
		    	{
		    		session.setAttribute("conf", u);
		    		response.sendRedirect("welcome.jsp");
		    	}
		    }
	    }
	} 
	
}
