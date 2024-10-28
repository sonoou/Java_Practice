import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class MySessionListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent e){
		try{
			HttpSession s = e.getSession();
			s.setAttribute("name","appsquadz");
			System.out.println("session created");
		}
		catch(Exception e1){
		}
	}
	public void sessionDestroyed(HttpSessionEvent e){
		System.out.println("session destroyed");
	}
}

