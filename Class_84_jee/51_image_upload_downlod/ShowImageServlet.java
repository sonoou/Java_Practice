import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import com.oreilly.servlet.*;

public class ShowImageServlet extends GenericServlet{
	InputStream f = null;
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
			PreparedStatement ps = c.prepareStatement("select img from image24 where userid=?");
			ps.setString(1,"26");
			ResultSet rs = ps.executeQuery();
			String path = getServletContext().getRealPath("/");
			rs.next();
			f = rs.getBinaryStream("img");
			FileOutputStream f1 = new FileOutputStream(path+"/"+"abc12"+".jpg");
			int i=0;
			while((i = f.read())!=-1){
				f1.write(i);
			}
			out.println("<img src='abc12.jpg' width='160' height='170'>");
		}
		catch(Exception e){
			out.println(e);
		}
	}
}
