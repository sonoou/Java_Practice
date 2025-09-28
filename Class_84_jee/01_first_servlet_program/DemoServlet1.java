import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet1 implements Servlet{
	public void init(ServletConfig con){
	}
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("hello servlet via *.go");
		out.println("<br>"); 
		out.println("Reference id="+this);
		out.println("<br>");
		out.println("Thread Name="+Thread.currentThread().getName());
		try{
			//Thread.sleep(150000);
		}
		catch(Exception e){
			//empty
		}
		out.println("</body></html>"); 
	}
	public void destroy(){
		//empty
	}
	public ServletConfig getServletConfig(){
		return null;
	}
	public String getServletInfo(){
		return null;
	}
}