<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<html>
	<head>
		<title>Tag Example</title>
	</head>
	<body>
		<c:set var="loan" value="Property Loan" scope="request" />
		<c:if test="${requestScope.loan != null }" >
			Loan type is <c:out value="${requestScope.loan}" />
		</c:if>
	</body>
</html>
