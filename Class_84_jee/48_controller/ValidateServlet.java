import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ValidateServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		System.out.println("validate servlet");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
			Statement s = c.createStatement();
			String s1 = "select * from emp101 where name='"+name+"' and pass='"+pass+"'";
			ResultSet rs = s.executeQuery(s1);
			if(rs.next()){
				RequestDispatcher rd = req.getRequestDispatcher("action?check=wel");
				rd.forward(req,res);
			}
			else{
				RequestDispatcher rd1 = req.getRequestDispatcher("action?check=err");
				rd1.forward(req,res);
			}
		}
		catch(Exception e){
			out.println(e);
		}
	}
}
