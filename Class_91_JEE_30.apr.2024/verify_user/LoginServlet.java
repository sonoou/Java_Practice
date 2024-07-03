import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			String s1 = "SELECT * FROM emp101 WHERE name='"+name+"' AND pass='"+pass+"'";
			//out.println(s1);
			ResultSet rs = s.executeQuery(s1);
			if(rs.next()){
				out.println("User is valid");
			}
			else{
				out.println("User is invalid");
			}
		}
		catch(Exception e){
			out.println(e);
		}
		out.println("</body></html>");
	}
}
