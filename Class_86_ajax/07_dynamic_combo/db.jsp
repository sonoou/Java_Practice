<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>

<%
  response.setContentType("text/xml");
  String sn = request.getParameter("ok");
  int i = Integer.parseInt(sn);
  
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
  Statement st = con.createStatement();
  ResultSet rs = st.executeQuery("SELECT name FROM student WHERE age="+i);
  out.println("<student>");
  while(rs.next()){
    out.println("<stdname>"+rs.getString(1)+"</stdname>");
  }
  out.println("</student>");
	rs.close();
	st.close();
	con.close();
%>
