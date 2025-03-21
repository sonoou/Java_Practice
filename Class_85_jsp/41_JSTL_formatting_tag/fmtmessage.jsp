<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head>
		<title>JSTL fmt:bundle Tag</title>
	</head>
	<body>
		<fmt:setLocale value="en_US" />
		<fmt:bundle basename="application" >
			Driver name=<fmt:message key="dbdriver" />
			<br>
			Url=<fmt:message key="dburl" />
			<br>
			User name=<fmt:message key="dbuser" />
			<br>
			Password= <fmt:message key="dbpassword" />
		</fmt:bundle>
	</body>
</html>
