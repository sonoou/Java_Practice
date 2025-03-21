<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html>
	<head>
		<title>Tag Example</title>
	</head>
	<body>
		<c:forEach var="i" begin="1" end="5">
			<p>
			Item <c:out value="${i}" />
			</p>
		</c:forEach>
	</body>
</html>
