import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyCookie extends HttpServlet{
	PrintWriter out;
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		out = res.getWriter();
		Cookie c[] = req.getCookies();
		if(c == null){
			req.getSession();
			Cookie c1 = new Cookie("name","appsquadz");
			Cookie c2 = new Cookie("add","noida");
			res.addCookie(c1);
			res.addCookie(c2);
			out.println("cookies added");
		}
		else{
			for(int i=0;i<c.length;i++){
				out.println(c[i].getName());
				out.println(c[i].getValue());
				out.println("<br>");
			}
		}
	}
}
