<html>
	<body>
		<%
			String firstNo = request.getParameter("firstNo");
			String secondNo = request.getParameter("secondNo");
		%>
		<jsp:useBean id="t1" class="my.AddBean" />
		<jsp:setProperty name="t1" property="firstNo" param="firstNo" />
		<jsp:setProperty name="t1" property="secondNo" param="secondNo" />
		<%
			int r = t1.add();
			out.println("The sum of two no = "+r);
		%>
	</body>
</html>
