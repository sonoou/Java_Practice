import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class I18nServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		String t = null;
		String name = null;
		String pass = null;
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Locale l = req.getLocale();
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle",l);
		Enumeration e = rb.getKeys();
		while(e.hasMoreElements()){
			String k = (String)e.nextElement();
			if(k.equals("app.title")){
				t=rb.getString(k);
			}
			if(k.equals("app.username")){
				name=rb.getString(k);
			}
			if(k.equals("app.password")){
				pass=rb.getString(k);
			}
		}
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:blue'>"+t+"</h1>");
		out.println("<br>");
		out.println("<form action='login'>");
		out.println(name+" ");
		out.println("<input type='text' name='uname'>");
		out.println("<br>");
		out.println(pass+" ");
		out.println("<input type='text' name='upass'>");
		out.println("<br>");
		out.println("<input type='submit'>");
		out.println("</form>");
		out.println("</body></html>");
	}
}
