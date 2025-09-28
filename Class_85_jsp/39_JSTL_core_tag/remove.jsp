<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<html>
	<head>
		<title>Tag Example</title>
	</head>
	<body>
		<c:set var="price" value="1011.0" scope="session" />
		<c:out value="${price}" />
		<c:remove var="price" />
		<br>
		<c:out value="${price}" />
	</body>
</html>
