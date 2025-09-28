import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class SessionListenerServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		HttpSession s = req.getSession();
		String s1 = (String)s.getAttribute("name");
		out.println(s1+" "+s.isNew());
		out.println("<br>");
		out.println("<a href='log'>Logout</a>");
		out.println("</body></html>");
	}
}
