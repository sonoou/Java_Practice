<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<%
	response.setContentType("text/html");
	String tab = request.getParameter("table");
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "System";
	String pass1 = "Oracle10g";
	try{
		Class.forName(driver);
		Connection c = DriverManager.getConnection(url,user,pass1);
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from "+tab);
		while(rs.next()){
			out.println(rs.getString(1)+" "+rs.getString(2));
			out.println("<br>");
		}
	}
	catch(Exception e){
		out.println(e);
	}
%>
