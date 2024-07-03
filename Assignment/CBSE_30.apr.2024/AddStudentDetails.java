import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

@WebServlet(name = "AddStudentDetails", urlPatterns = {"/AddStudentDetails"})
public class AddStudentDetails extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out = res.getWriter();
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			int computer = Integer.parseInt(req.getParameter("Computer"));
			int english = Integer.parseInt(req.getParameter("English"));
			int science = Integer.parseInt(req.getParameter("Science"));
			int math = Integer.parseInt(req.getParameter("Math"));
			int art = Integer.parseInt(req.getParameter("Art"));
			int hindi = Integer.parseInt(req.getParameter("Hindi"));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			int x = s.executeUpdate("INSERT INTO student VALUES("+id+",'"+name+"',"+computer+","+english+","+science+","+math+","+art+","+hindi+")");
			printMessage(out,"Added Succefully");
		}
		catch(SQLException sql){
			if(sql.getErrorCode()==1){
				printMessage(out,"Id is already in use<br>Please try again.");
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
					"   	<title>Success</title>"+
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
