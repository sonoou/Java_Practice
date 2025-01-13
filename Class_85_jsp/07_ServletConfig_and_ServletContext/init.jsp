<html>
<body>
<%!
	String s;
	public void jspInit(){
		ServletConfig con = getServletConfig();
		s = con.getInitParameter("name");
	}
%>
<%
	String s1 = application.getInitParameter("name1");
	String s2 = config.getInitParameter("name");
	out.println(s1);
	out.println("<br>");
	out.println(s2+" "+s);
%>
</body>
</html>
