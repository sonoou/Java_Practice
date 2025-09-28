<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<html>
	<body>
		<b>Error:</b>${pageContext.exception}
		<br>
		<br>
		<b>URI:</b>${pageContext.errorData.requestURI}
		<br>
		<b>Status code:</b>
		<br>
		${pageContext.errorData.statusCode}
		<c:forEach var="trace" items="${pageContext.exception.stackTrace}">
			<p>${trace}</p>
		</c:forEach>
	</body>
</html>
