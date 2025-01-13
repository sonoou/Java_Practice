<html>
<body>
	<%@ page contentType="application/vnd.ms-excel" %>
	<%
			response.setHeader("Content-Disposition","attachment; filename=sample.xlsx");
			out.println("Name\tHindi\tEnglish");
			out.println("Lalu\t10\t20");
	%>
</body>
</html>
