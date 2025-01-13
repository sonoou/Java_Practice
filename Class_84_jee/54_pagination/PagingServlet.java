import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;

public class PagingServlet extends HttpServlet{
	int p;
	Integer pageNo;
	static String table;
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Oracle10g");
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String ta = req.getParameter("tabl");
			if(ta!=null){
				table = ta;
			}
			else{
				table = table;
			}
			ResultSet rs = s.executeQuery("select * from "+table);
			ResultSetMetaData rmdt = rs.getMetaData();
			int columnCount = rmdt.getColumnCount();
			try{
				rs.last();
			}
			catch(Exception e){
				//out.println(e);
			}
			int totalRecords = rs.getRow();
			int recordPerPage = 5;
			int pages = totalRecords / recordPerPage;
			int r = totalRecords % recordPerPage;
			if(r == 0){
				pages = pages;
			}
			else{
				pages = pages + 1;
			}
			for(int i = 1; i <= pages; i++){
				out.println("<a href='ps?pageno="+i+"'>"+i+"</a>");
			}
			String url =  req.getParameter("pageno");
			if(url == null){
				pageNo =  new Integer(1);
			}
			else{
				pageNo = new Integer(Integer.parseInt(req.getParameter("pageno")));
			}
			p = pageNo.intValue();
			int first, last;
			last = p * 5;
			first = last + 1 - 5;
			out.println("<html><body>");
			out.println("<table bgcolor = 'yellow' border = 1 width = 400>");
			out.println("<tr>");
			for(int i = 1; i <= columnCount; i++){
				out.println("<th>"+rmdt.getColumnName(i)+"</th>");
			}
			for(int i = first; i <= last; i++){
				rs.absolute(first);
				out.println("<tr>");
				for(int j = 1; j <= columnCount; j++){
					out.println("<td>"+rs.getString(j)+"</td>");
				}
				first++;
			}
			out.println("</body></html>");
		}
		catch(Exception e){
			//out.println(e);
		}
	}
}
