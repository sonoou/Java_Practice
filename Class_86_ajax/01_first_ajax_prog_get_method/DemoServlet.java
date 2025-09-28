import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		System.out.println("servlet");
		String s = (String)req.getParameter("name1");
		String s1 = (String)req.getParameter("name2");
		out.println("hello with ajax "+s);
		out.println("<br>");
		out.println("hello with ajax "+s1);
	}
}
