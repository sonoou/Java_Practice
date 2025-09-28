<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>

<%
	response.setContentType("text/xml");
	String sn = request.getParameter("ver");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from emp101 where name='"+sn+"'");
	if(rs.next()){
		out.println("name already exists");
	}
	else{
		out.println("valid name");
	}
	rs.close();
%>
