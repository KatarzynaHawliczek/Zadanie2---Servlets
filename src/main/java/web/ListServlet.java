package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import repositories.UserRepository;

@WebServlet("/goUserList")
public class ListServlet extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		UserRepository repository = new UserRepository();
		User user = (User) session.getAttribute("conf");
		if(user.getPermission().equals("admin"))
		{
			request.setAttribute("userList", repository.getAll());
			request.getRequestDispatcher("userList.jsp").forward(request, response);
			response.sendRedirect("userList.jsp");
		}
		else
		{
			response.sendRedirect("permissionError.jsp");
		}
	}

}
