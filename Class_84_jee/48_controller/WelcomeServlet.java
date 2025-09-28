import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class WelcomeServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Welcome servlet</h1>");
		out.println("</body></html>");
	}
}
