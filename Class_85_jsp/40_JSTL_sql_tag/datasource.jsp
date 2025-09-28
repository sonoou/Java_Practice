<%@ taglib prefix="sql" uri="/WEB-INF/sql.tld" %>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>
<html>
	<head>
		<title>JSTL sql:query Tag</title>
	</head>
	<body>
		<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver"
																url="jdbc:oracle:thin:@localhost:1521:xe"
																user="System" password="Oracle10g" />
		<sql:query dataSource="${ds}" var="result" >
			SELECT * FROM emp101
		</sql:query>
		<table border="1" width="100%" >
			<tr>
				<th>Name</th>
				<th>Pass</th>
			</tr>
			<c:forEach var="row" items="${result.rows}" >
				<tr>
					<td><c:out value="${row.NAME}" /></td>
					<td><c:out value="${row.PASS}" /></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>


