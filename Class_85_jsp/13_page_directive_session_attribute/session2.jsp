<html>
<body>
	<%@ page session="true" %>
	<% String name = (String)session.getAttribute("name");
			String pass = (String)session.getAttribute("pass");
			out.println(name+" "+pass);
			out.println("<br>");
			out.println(" "+session.isNew());
	%>
</body>
</html>
