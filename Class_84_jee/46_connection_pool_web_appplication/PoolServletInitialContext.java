import java.io.*;
import javax.annotation.Resources;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.*;
import java.sql.*;

@WebServlet(name = "PoolServlet1", urlPatterns = {"/pool1"})
public class PoolServletInitialContext extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out =  res.getWriter();
		out.println("<html><body>");
		try{
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("tindi");
			Connection c = ds.getConnection();
			Statement s = c.createStatement();
			String s1 = "select * from emp101";
			ResultSet rs = s.executeQuery(s1);
			while(rs.next()){
				out.println("id: "+rs.getString(1));
				out.println("name: "+rs.getString(2));
				out.println("<br>");
			}
		}
		catch(Exception e){
			out.println(e);
		}
	}
}
