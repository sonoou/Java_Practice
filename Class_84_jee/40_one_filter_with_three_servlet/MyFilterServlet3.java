import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyFilterServlet3 extends HttpServlet{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		out = res.getWriter();
		out.println("MyFilterServlet3");
	}
}
