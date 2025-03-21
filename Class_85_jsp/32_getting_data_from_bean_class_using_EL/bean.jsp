<%@ page isELIgnored = "false" %>
<html>
	<head>
		<title>Expression Language</title>
	</head>
	<body>
		<jsp:useBean id="t1" class="my.MyBean" />
		<jsp:setProperty name="t1" property="name" value="lalu" />
		<jsp:setProperty name="t1" property="pass" value="rabari" />
		${t1.name}
		<br>
		${t1.pass}
		<br>
		${t1.add(10,20)}
		<br>
		${t1.validate()}
	</body>
</html>
