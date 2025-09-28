import my.*;
import java.rmi.*;
import java.rmi.server.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		try{
			my.MyRemote m = (my.MyRemote)Naming.lookup("rmi://localhost:1099/appsquadz");
			out.println(m.add(12,15));
		}
		catch(Exception e){
			out.println("</body></html>");
		}
	}
}
