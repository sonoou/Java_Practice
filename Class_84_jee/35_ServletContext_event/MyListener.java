import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class MyListener implements ServletContextListener{
	Connection c;
	public void contextInitialized(ServletContextEvent e){
		try{
			ServletContext ctx = e.getServletContext();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
			ctx.setAttribute("con",c);
			System.out.println("context created");
		}
		catch(Exception e1){}
	}
	public void contextDestroyed(ServletContextEvent e){
		try{
			c.close();
		}
		catch(Exception e1){}
	}
}
