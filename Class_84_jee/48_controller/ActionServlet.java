import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String url = req.getParameter("check");
		//out.println(url);
		RequestDispatcher rd = req.getRequestDispatcher(url);
		rd.forward(req,res);
	}
}
