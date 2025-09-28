<%@ page import="java.io.*,java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<%
	response.setContentType("text/xml");
	String sn = request.getParameter("ok");
	int i = Integer.parseInt(sn);
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from student where age="+sn);
	if(rs.next()){
		out.println("<student>");
		out.println("<stdid>"+rs.getInt(1)+"</stdid>");
		out.println("<stdfirstname>"+rs.getString(2)+"</stdfirstname>");
		out.println("<stdage>"+rs.getString(3)+"</stdage>");
		out.println("</student>");
	}
%>
