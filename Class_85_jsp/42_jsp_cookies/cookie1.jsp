<html>
	<body>
<%
	Cookie c[] = request.getCookies();
	for(int i=0; i<c.length; i++){
		out.println(c[i].getName());
		out.println(c[i].getValue());
		out.println("<br>");
	}
%>
	</body>
</html>
