<html>
<body>
	<%@ page session="false" %>
	<%
		HttpSession s = request.getSession(false);
		if(s != null){
			String name = (String)s.getAttribute("name");
			String pass = (String)s.getAttribute("pass");
			out.println("Welcome "+name);
			out.println("<br>");
			out.println(" "+s.isNew());
		}
		else{
			out.println("bavari pooch login to kar le");
		}
	%>
</body>
</html>
