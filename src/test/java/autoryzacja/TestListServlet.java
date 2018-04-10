package autoryzacja;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import web.RegisterServlet;

public class TestListServlet extends Mockito
{
	
	@Test
	public void servlet_should_proceed_to_the_premium_page() throws IOException, ServletException
	{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		
		when(response.getWriter()).thenReturn(writer);
		RegisterServlet servlet = new RegisterServlet();
		
		when(request.getParameter("username")).thenReturn("admin");
		when(request.getParameter("password")).thenReturn("admin");
		
		servlet.doGet(request, response);
		verify(response).sendRedirect("register.jsp");
	}

}
