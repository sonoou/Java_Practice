<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/fmt.tld" prefix="fmt" %>

<html>
	<head>
		<title>JSTL fmt:formatNumber Tag</title>
	</head>
	<body>
		<h3>Number Format: </h3>
		<c:set var="balance" value="120000.2309" />
		<p>Formatted Number (1): <fmt:formatNumber value="${balance}" type="currency" />
		</p>
		<p>Formatted Number (2): <fmt:formatNumber value="${balance}" type="number" maxIntegerDigits="3" />
		</p>
		<p>Formatted Number (3): <fmt:formatNumber value="${balance}" type="number" maxFractionDigits="3" />
		</p>
		<p>Formatted Number (4): <fmt:formatNumber value="${balance}" type="number" groupingUsed="false" />
		</p>
		<p>Formatted Number (5): <fmt:formatNumber value="${balance}" type="percent" maxIntegerDigits="3" />
		</p>
		<p>Formatted Number (6): <fmt:formatNumber value="${balance}" type="percent" maxFractionDigits="3" />
		</p>
		<p>Formatted Number (7): <fmt:formatNumber value="${balance}" type="number" pattern="###.####E0" />
		</p>
		<p>Currency in USA :
			<fmt:setLocale value="en_US" />
			<fmt:formatNumber value="${balance}" type="currency" />
		</p>
	</body>
</html>
