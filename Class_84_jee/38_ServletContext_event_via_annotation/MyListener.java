import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent e){
		try{
			ServletContext ctx = e.getServletContext();
			ctx.setAttribute("name","appsquadz");
			System.out.println("context created");
		}
		catch(Exception e1){}
	}
	public void contextDestroyed(ServletContextEvent e){
		System.out.println("context destroyed");
	}
}
