import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ExcelServlet extends HttpServlet{
	PrintWriter out;
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("application/vnd.ms-excel");
		out = res.getWriter();
		out.println("Names\tHindi\tEnlish\tMaths\tTotal");
		out.println("Lalua\t35\t20\t95\t=sum(b2:d2)");
	}
}
