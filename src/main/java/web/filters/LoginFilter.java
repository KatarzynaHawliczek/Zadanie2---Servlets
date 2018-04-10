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

@WebFilter("/login")
public class LoginFilter implements Filter 
{
	
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();
		if(session.getAttribute("conf")!=null)
		{
			httpResponse.sendRedirect("welcome.jsp");
			return;
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
