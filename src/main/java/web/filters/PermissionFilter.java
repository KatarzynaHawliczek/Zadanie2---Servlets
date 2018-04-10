package web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;

@WebFilter("/goPermission")
public class PermissionFilter implements Filter 
{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		HttpServletRequest httpRequest = (HttpServletRequest) request; 
		HttpServletResponse httpResponse = (HttpServletResponse) response;
	    HttpSession session = httpRequest.getSession();
	    User user = (User) session.getAttribute("conf");
	    if(user.getUsername().equals("admin"))
	    {
	    	httpResponse.sendRedirect("permission.jsp");
	    	return;
	    }
	    else
	    {
	    	httpResponse.sendRedirect("permissionError.jsp");
	    }
	    chain.doFilter(request, response);
	}
	
	public void destroy() 
	{
		
	}
	
	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}

}
