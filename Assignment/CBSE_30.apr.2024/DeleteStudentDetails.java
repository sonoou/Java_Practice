import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet(name = "DeleteStudentDetails",urlPatterns = {"/DeleteStudentDetails"})
public class DeleteStudentDetails extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out = res.getWriter();
			String checkId[] = req.getParameterValues("checkId");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			for(int i=0;i<checkId.length;i++){
				int x = s.executeUpdate("DELETE FROM student WHERE id="+checkId[i]);
				out.println("<h1>Student Deleted");
			}
		}
		catch(SQLException sql){
			out.println(sql);
		}
		catch(IOException ioe){
			out.println(ioe);
		}
		catch(Exception e){
			out.println(e);
		}
	}
}