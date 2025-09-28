import javax.servlet.http.*;
import javax.servlet.*;
import com.oreilly.servlet.*;
import java.sql.*;
import java.io.*;

public class StoreImageServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		String path = getServletContext().getRealPath("image");
		MultipartRequest mpr = new MultipartRequest(req,path,500*1024*1024);
		String path1 = mpr.getOriginalFileName("file");//file is the req parameter name
		String path2 = path+"/"+path1;
		FileInputStream fin = new FileInputStream(path2);
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
			Statement st = c.createStatement();
			int a = st.executeUpdate("delete from image24 where userid='26'");
			PreparedStatement ps = c.prepareStatement("insert into image24 values(?,?)");
			ps.setBinaryStream(2,fin,fin.available());
			ps.setString(1,"26");
			ps.executeUpdate();
			c.close();
		}
		catch(Exception e){
			out.println(e);
		}
		out.println("<html><body>");
		out.println("image path = "+path);
		out.println("<h1>Image Saved successfully</h1>");
		out.println("<a href='show'>ShowImage</a>");
		out.println("</body></html>");
	}
}
