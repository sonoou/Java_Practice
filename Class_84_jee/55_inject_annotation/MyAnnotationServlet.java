import javax.inject.Inject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyAnnotationServlet", urlPatterns = {"/hello"})
public class MyAnnotationServlet extends HttpServlet{
	@Inject MyBean mybean;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
    	res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2> Hello World Servlet Annotation Example</h2>");
		out.println(mybean.getMessage());
		out.close();
	}
}
