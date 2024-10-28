import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class RequestServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if(name.equals("Codesquadz") && pass.equals("Codesquadz")){
			out.println("User is valid through service method");
		}
		else{
			out.println("User is post invalid");
			out.println("</body></html>");
		}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if(name.equals("Codesquadz") && pass.equals("Codesquadz")){
			out.println("User is valid through get");
		}
		else{
			out.println("User is invalid through get");
			out.println("</body></html>");
		}
	}
}