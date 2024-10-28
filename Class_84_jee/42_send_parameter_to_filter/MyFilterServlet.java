import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyFilterServlet extends HttpServlet{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		out = res.getWriter();
		ServletContext ctx = getServletContext();
		String s = (String)ctx.getAttribute("name");
		out.println("driver = "+s);
	}
}
