import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyCookie1 extends HttpServlet{
	PrintWriter out;
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		out = res.getWriter();
		Cookie c[] = req.getCookies();
		if(c == null){
			Cookie c1 = new Cookie("name","appsquadz");
			Cookie c2 = new Cookie("add","noida");
			res.addCookie(c1);
			res.addCookie(c2);
			c1.setMaxAge(30*60);
			c2.setMaxAge(30*60);
			out.println("cookies added");
		}
		else{
			out.println("<html><body>");
			out.println("<form>");
			out.println("<input type='text' value='"+c[0].getValue()+"'>");
			out.println("<br>");
			out.println("<input type='text' value='"+c[1].getValue()+"'>");
			out.println("<br>");
			out.println("<input type='submit'>");
			out.println("</form>");
			out.println("</body></html>");
		}
	}
}
