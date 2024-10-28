import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class WelServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String s = (String) req.getAttribute("name");
		out.println("welcome to MyWeb of Codesquadz ="+s);
		out.println("</body></html>");
	}
}
