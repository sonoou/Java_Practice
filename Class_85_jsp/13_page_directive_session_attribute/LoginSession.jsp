<html>
<body>
	<%@ page import="java.sql.*" %>
	<%@ page session="false" %>
	<%
			String name = request.getParameter("name");
			String pass = request.getParameter("pass");
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
				Statement s2 = c.createStatement();
				String s1 = "select * from emp101 where name='"+name+"' and pass='"+pass+"'";
				ResultSet rs1 = s2.executeQuery(s1);
				if(rs1.next()){
					HttpSession s = request.getSession();
					s.setAttribute("name",name);
					s.setAttribute("pass",pass);
					out.println("Data set successfully "+s.isNew());
					out.println("<br>");
					out.println("<a href='session1.jsp'>session1</a><br>");
					out.println("<a href='session2.jsp'>session2</a><br>");
					out.println("<a href='session3.jsp'>session3</a>");
				}
				else{
					out.println("User is InValid");
				}
			}
			catch(Exception e){
				out.println(e);
			}
	%>
</body>
</html>
