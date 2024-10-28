import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class WelServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("welcome to Codesquadz web via Tomcat");
		out.println("</body></html>");
	}
}
