import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class RequestServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
			Statement s = c.createStatement();
			int x = s.executeUpdate("insert into emp101 values('"+name+"','"+pass+"')");
			ResultSet rs = s.executeQuery("select * from emp101");
			ResultSetMetaData rsmd = rs.getMetaData();
			out.println("<table bgcolor='yellow' border=1 width=200>");
			out.println("<tr>");
			for(int i=1;i<=rsmd.getColumnCount(); i++){
				out.println("<th>"+rsmd.getColumnName(i)+"</th>");
			}
			while(rs.next()){
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("</tr>");
			}
		}
		catch(Exception e){
			//empty
		}
		out.println("</table>");
		if(name.equals("Codesquadz") && pass.equals("Codesquadz")){
			out.println("User is post valid");
		}
		else{
			out.println("User is post invalid");
		}
		out.println("</body></html>");
	}
}