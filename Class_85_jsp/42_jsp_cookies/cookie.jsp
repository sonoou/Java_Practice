<%
	Cookie firstName = new Cookie("first_name",request.getParameter("first_name"));
	Cookie lastName = new Cookie("last_name",request.getParameter("last_name"));
	firstName.setMaxAge(60*60);
	lastName.setMaxAge(60*60);

	response.addCookie(firstName);
	response.addCookie(lastName);
	out.println("cookies added");
%>
<html>
	<body>
		<b>First name: </b><%=request.getParameter("first_name") %><br/>
		<b>Last name: </b><%=request.getParameter("last_name") %>
	</body>
</html>
				
