import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UpdateStudentDetails", urlPatterns = {"/UpdateStudentDetails"})
public class UpdateStudentDetails extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out = res.getWriter();

			int id = Integer.parseInt(req.getParameter("ID"));
			int oldid = Integer.parseInt(req.getParameter("oldid"));
			String name = req.getParameter("NAME");
			int computer = Integer.parseInt(req.getParameter("COMPUTER"));
			int english = Integer.parseInt(req.getParameter("ENGLISH"));
			int science = Integer.parseInt(req.getParameter("SCIENCE"));
			int math = Integer.parseInt(req.getParameter("MATH"));
			int art = Integer.parseInt(req.getParameter("ART"));
			int hindi = Integer.parseInt(req.getParameter("HINDI"));

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			s.executeUpdate("UPDATE student SET id="+id+",name='"+name+"',computer="+computer+",english="+english+",science="+science+",math="+math+",art="+art+",hindi="+hindi+" WHERE id="+oldid);
			printMessage(out,"Updated Successfully");			
		}
		catch(SQLException sql){
			if(sql.getErrorCode()==1){
				printMessage(out,"Id is already in use");
			}
			else{
				out.println(sql);
			}
		}
		catch(IOException ioe){
			out.println(ioe);
		}
		catch(Exception e){
			out.println(e);
		}
	}
	private void printMessage(PrintWriter out, String message){
		out.println("<html>"+
					"	<head>"+
					"   	<title>Update Success</title>"+
					"    	<style>"+
					"       	 @import url(\"http://localhost:7002/s1/css/success.css\")"+
					"    	</style>"+
					"	</head>"+
					"	<body>"+
					"    	<div class='main'>"+
					"        	<div class='success'>"+
					"            	<h1>"+message+"</h1>"+
					"				<a href=\"http://localhost:7002/s1/\">Back to Home</a>"+
					"        	</div>"+
					"    	</div>"+
					"	</body>"+
					"</html>"
				);
	}
}
