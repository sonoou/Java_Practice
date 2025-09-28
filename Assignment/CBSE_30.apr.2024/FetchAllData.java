import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet(name = "FetchAllData",urlPatterns = {"/FetchAllData"})
public class FetchAllData extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out = null;
		try{
			res.setContentType("text/html");
			out = res.getWriter();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM student");
			out.println("<!DOCTYPE html>"+
						"<html lang=\"en\">"+
						"<head>"+
						"    <meta charset=\"UTF-8\">"+
						"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"+
						"    <title>All Data</title>"+
						"    <style>"+
						"        @import url(\"./css/all_data.css\");"+
						"    </style>"+
						"</head>"+
						"<body>"+
						"    <div class=\"main\">"+
						"        <div class=\"all_data\">"+
						"            <form action=\"DeleteStudentDetails\" method=\"post\">"+
						"                <h1>All Students Data</h1>"+
						"                <table>"+
						"                    <tr>"+
						"                        <td>Select</td>"+
						"                        <td>ID</td>"+
						"                        <td>Name</td>"+
						"                        <td>Computer</td>"+
						"                        <td>English</td>"+
						"                        <td>Science</td>"+
						"                        <td>Math</td>"+
						"                        <td>Art</td>"+
						"                        <td>Hindi</td>"+
						"                    </tr>"
					);
			while(rs.next()){
				out.println("                    <tr>"+
							"                        <td>"+
							"                            <input type=\"checkbox\" name=\"checkId\" value=\""+rs.getString(1)+"\">"+
							"                        </td>"+
							"                        <td>"+rs.getString(1)+"</td>"+
							"                        <td>"+rs.getString(2)+"</td>"+
							"                        <td>"+rs.getString(3)+"</td>"+
							"                        <td>"+rs.getString(4)+"</td>"+
							"                        <td>"+rs.getString(5)+"</td>"+
							"                        <td>"+rs.getString(6)+"</td>"+
							"                        <td>"+rs.getString(7)+"</td>"+
							"                        <td>"+rs.getString(8)+"</td>"+
							"                    </tr>"
						);
			}
			out.println("                    <tr>"+
						"                        <td colspan=\"9\">"+
						"                            <input type=\"submit\" value=\"Delete\" class=\"delbtn\">"+
						"                        </td>"+
						"                    </tr>"+
						"                </table>"+
						"            </form>"+
						"        </div>"+
						"    </div>"+
						"</body>"+
						"</html>"
					);
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