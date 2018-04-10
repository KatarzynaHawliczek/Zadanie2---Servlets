package web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import repositories.UserRepository;

@WebFilter("/")
public class RegisterFilter implements Filter 
{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		UserRepository repository = new UserRepository();
		if(repository.count()!=0)
		{
			if(repository.exists(request.getParameter("username")))
			{
				httpResponse.sendRedirect("registerError.jsp");
				return;
			}
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
