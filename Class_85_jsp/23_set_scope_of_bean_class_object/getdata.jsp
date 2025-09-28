<html>
	<body>
		<jsp:useBean id="t1" class="my.AddBean" scope="session" />
		<jsp:getProperty name="t1" property="firstNo" />
		<br>
		<jsp:getProperty name="t1" property="secondNo" />
		<br>
		<%
			int r = t1.add();
			out.println("The sum of two no = "+r);
		%>
	</body>
</html>
