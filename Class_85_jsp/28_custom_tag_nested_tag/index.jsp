<%@ taglib prefix="M" uri="/WEB-INF/tlds/my1.tld" %>
<html>
	<body>
		<%! String s = "Attribute"; %>
		<M:MyDate name="<%= s %>" >
			<M:SubTag />
		</M:MyDate>
	</body>
</html>
