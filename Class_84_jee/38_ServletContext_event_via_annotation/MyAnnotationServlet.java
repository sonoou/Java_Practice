import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "MyAnnotationServlet", urlPatterns = {"/listener"})
public class MyAnnotationServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		ServletContext ctx = getServletContext();
		String s = (String)ctx.getAttribute("name");
		out.println("<h2>Hello World Servlet Annotation Example</h2>");
		out.close();
	}
}
