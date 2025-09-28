<%@ taglib prefix="sql" uri="/WEB-INF/sql.tld" %>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld" %>

<html>
	<head>
		<title>JSTL sql:query Tag</title>
	</head>
	<body>
		<sql:setDataSource var="ds" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="System" password="Oracle10g" />
		<sql:update dataSource="${ds}" var="count">
			DELETE FROM emp65 WHERE id=30
		</sql:update>
		<sql:update dataSource="${ds}" sql="UPDATE emp65 SET name='pklalu' WHERE id=?" var="result" >
			<sql:param value="351"></sql:param>
		</sql:update>
		<sql:query dataSource="${ds}" var="result">
			SELECT * FROM emp65
		</sql:query>

		<table border="1" width="100%" >
			<tr>
				<th>Name</th>
				<th>Id</th>
			</tr>
			<c:forEach var="row" items="${result.rows}" >
				<tr>
					<td><c:out value="${row.name}" /></td>
					<td><c:out value="${row.id}" /></td>
				</tr>
			</c:forEach>
		</table>				
	</body>
</html>
