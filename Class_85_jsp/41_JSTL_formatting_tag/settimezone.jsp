<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head>
		<title>JSTL fmt:setTimeZone Tag </title>
	</head>
	<body>
		<p>Date in Current Zone:
		<fmt:formatDate value="<%= new java.util.Date() %>" type="both" timeStyle="long" />
		</p>
		<p> Change Time Zone to GMT-8</p>
		<fmt:setTimeZone value="GMT-8" />
		<p>Date in Changed Zone:
		<fmt:formatDate value="<%= new java.util.Date() %>" type="both" timeStyle="long" dateStyle="long" />
	</body>
</html>
