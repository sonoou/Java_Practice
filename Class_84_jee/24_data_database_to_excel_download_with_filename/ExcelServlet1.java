import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ExcelServlet1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp101");
			ResultSetMetaData rd = rs.getMetaData();
			res.setContentType("application/vnd.ms-excel");
			res.setHeader("Content-Disposition","attachment; filename=sample.xls");
			PrintWriter out = res.getWriter();
			int count = rd.getColumnCount();
			for(int i=1;i<=count;i++){
				out.println(rd.getColumnName(i)+"\t");
			}
			out.println();
			int x = 2;
			while(rs.next()){
				out.print(rs.getString(1)+"\t");
				out.print(rs.getString(2)+"\t");
				out.println();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
