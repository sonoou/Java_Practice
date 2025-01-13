<%! String name,pass; %>
<%
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
%>
<jsp:forward page="demo1.jsp">
<jsp:param name="name" value="<%=name %>" />
<jsp:param name="pass" value="<%=pass %>" />
</jsp:forward>
<br>
<br>
<%="example of include action" %>
