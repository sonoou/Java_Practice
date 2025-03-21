<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<html>
	<head>
		<title>Tag Example</title>
	</head>
	<body>
		<%
		String[] windows = new String[]{"Windows XP","Windows 7","Windows 8","Window mobile"};
		pageContext.setAttribute("windows",windows);
		%>
		<c:forEach var="window" items="${pageScope.windows}">
			<c:out value="${window}"/>
		</c:forEach>
	</body>
</html>

