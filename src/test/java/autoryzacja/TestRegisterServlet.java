package autoryzacja;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import web.RegisterServlet;

public class TestRegisterServlet extends Mockito
{
	
	@Test
	public void servlet_should_not_register_user_if_any_of_the_values_is_null() throws IOException, ServletException
	{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		
		when(response.getWriter()).thenReturn(writer);
		RegisterServlet servlet = new RegisterServlet();
		
		when(request.getParameter("username")).thenReturn(null);
		when(request.getParameter("password")).thenReturn(null);
		when(request.getParameter("confirmpassword")).thenReturn(null);
		when(request.getParameter("email")).thenReturn(null);
		
		servlet.doGet(request, response);
		verify(response).sendRedirect("register.jsp");
	}
	
	@Test
	public void servlet_should_not_register_user_if_any_of_the_values_is_empty() throws IOException, ServletException
	{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		
		when(response.getWriter()).thenReturn(writer);
		RegisterServlet servlet = new RegisterServlet();
			
		when(request.getParameter("password")).thenReturn("passwd");
		when(request.getParameter("confirmpassword")).thenReturn("passwd1");
	
		servlet.doGet(request, response);
		verify(response).sendRedirect("register.jsp");
	}

	@Test
	public void servlet_should_not_register_user_if_password_is_not_as_confirmpassword() throws IOException, ServletException
	{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		
		when(response.getWriter()).thenReturn(writer);
		RegisterServlet servlet = new RegisterServlet();
		
		when(request.getParameter("username")).thenReturn("");
		when(request.getParameter("password")).thenReturn("");
		when(request.getParameter("confirmpassword")).thenReturn("");
		when(request.getParameter("email")).thenReturn("");
		
		servlet.doGet(request, response);
		verify(response).sendRedirect("register.jsp");
	}
	
	@Test
	public void servlet_should_register_user_when_the_values_are_provided() throws IOException, ServletException
	{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		
		when(response.getWriter()).thenReturn(writer);
		RegisterServlet servlet = new RegisterServlet();
		
		when(request.getParameter("username")).thenReturn("Antek");
		when(request.getParameter("password")).thenReturn("passwd");
		when(request.getParameter("confirmpassword")).thenReturn("passwd");
		when(request.getParameter("email")).thenReturn("antek@wp.pl");
		
		
		servlet.doGet(request, response);
		verify(response).sendRedirect("login.jsp");
	}
	
}
