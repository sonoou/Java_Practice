<%
	String s1 = request.getParameter("a");
	String s2 = request.getParameter("b");
	int i1 = Integer.parseInt(s1);
	int i2 = Integer.parseInt(s2);
	out.println(i1*i2);
%>
