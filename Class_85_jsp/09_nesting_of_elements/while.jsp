<%! int fontSize; %>
<html>
<head>
	<title>WHILE LOOP Example</title>
</head>
<% while(fontSize <= 7){ %>
	<font color="green" size="<%= fontSize %>">
		JSP Tutorial
	</font>
	</br>
<% fontSize++; %>
<% } %>
</body>
</html>
