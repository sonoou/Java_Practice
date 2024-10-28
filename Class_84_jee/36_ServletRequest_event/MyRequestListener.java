import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class MyRequestListener implements ServletRequestListener{
	public void requestInitialized(ServletRequestEvent e){
		try{
			ServletRequest s = e.getServletRequest();
			s.setAttribute("name","appsquadz");
			System.out.println("request created");
		}
		catch(Exception e1){}
	}
	public void requestDestroyed(ServletRequestEvent e){
		System.out.println("request destroyed");
	}
}
