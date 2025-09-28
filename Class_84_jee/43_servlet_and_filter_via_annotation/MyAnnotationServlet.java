import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "MyAnnotationServlet", urlPatterns = {"/hello"})
public class MyAnnotationServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out =  res.getWriter();
		ServletContext ctx = getServletContext();
		Integer count = (Integer)ctx.getAttribute("count");
		out.println("<h2>Hello World Servlet Annotation Example</h2>  "+count);
	}
}
