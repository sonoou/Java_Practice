import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class ErrServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<html><body>");
		out.println("Error Servlet invalid username and password");
		out.println("</body></html>");
	}
}
