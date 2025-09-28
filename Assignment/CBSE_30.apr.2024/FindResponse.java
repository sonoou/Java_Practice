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

@WebServlet(name = "FindResponse", urlPatterns = {"/FindResponse"})
public class FindResponse extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res){
		PrintWriter out=null;
		try{
			res.setContentType("text/html");
			out = res.getWriter();
			int id = Integer.parseInt(req.getParameter("id"));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM student WHERE id="+id);
			out.println("<!DOCTYPE html>"+
						"<html lang=\"en\">"+
						"<head>"+
						"    <meta charset=\"UTF-8\">"+
						"    <meta name=\"viewport\" content=\"width=device-width, \"initial-scale=1.0\">"+
						"    <title>Student Details</title>"+
						"    <style>"+
						"        @import url(\"./css/add_details.css\")"+
						"    </style>"+
						"</head>"+
						"<body>"+
						"    <div class=\"main\">"+
						"        <div id=\"studentForm\">"+
						"            <h2>Student Details</h2>"+
						"            <form method=\"post\" action=\"UpdateStudentDetails\">"+
						"                <table>"
					);
			if(rs.next()){
				ResultSetMetaData rsmd = rs.getMetaData();
				int column = rsmd.getColumnCount();
				for(int i=1;i<=column;i++){
					if(i==2){
						out.println("<tr>"+
									"	<td>"+rsmd.getColumnName(i)+"</td><td><input type=\"text\" value=\""+rs.getString(i)+"\" name=\""+rsmd.getColumnName(i)+"\"></td>"+
									"</tr"
								);
					}
					else{
						if(i==1){
							out.println("<tr>"+
										"	<td><input type=\"hidden\" value=\""+rs.getString(i)+"\" name=\"oldid\"></td>"+
										"</tr>"
									);
						}
						if(i==3){
							out.println("<tr>"+
										"	<td colspan=\"2\">Marks:</td>"+
										"</tr>"
									);
						}
						out.println("<tr>"+
									"	<td>"+rsmd.getColumnName(i)+"</td><td><input type=\"number\" range=\"[0-9]\" value=\""+rs.getInt(i)+"\" name=\""+rsmd.getColumnName(i)+"\"></td>"+
									"</tr"
								);
					}
				}
				out.println("<tr>"+
							"	<td colspan=\"2\"><input type=\"submit\" value=\"Update\"></td>"+
							"</tr"
							);
			}
			else{
				out.println("<h2>Not Found</h2>");
			}

			out.println("                </table>"+
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
