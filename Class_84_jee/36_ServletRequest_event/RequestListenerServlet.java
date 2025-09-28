import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class RequestListenerServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		System.out.println("after via servlet");
		String s1 = (String)req.getAttribute("name");
		out.println(s1);
		out.println("</body></html>");
	}
}
