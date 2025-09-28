import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class SendRedirect extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("before");
		String name = req.getParameter("name");
		String pass=req.getParameter("pass");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Oracle10g");
			Statement s = c.createStatement();
			String s1 = "select * from emp101 where name='"+name+"' and pass='"+pass+"'";
			ResultSet rs = s.executeQuery(s1);
			if(rs.next()){
				//res.sendRedirec("wel.html");
				res.sendRedirect("wel");
				//res.sendRedirect("http://google.com");
				//res.sendRedirec("http://localhost:9090/tom17/wel");
			}
			else{
				res.sendRedirect("err");
			}
		}
		catch(Exception e){
			out.println(e);
		}
		out.println("after");
		out.println("</body></html>");
	}
}
