<%@ taglib prefix="SqlTag" uri="/WEB-INF/tlds/db.tld" %>
<html>
	<body>
		<SqlTag:DbTag driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="System" pass="Oracle10g" >
			<SqlTag:Select>
				SELECT * FROM emp101
			</SqlTag:Select>
		</SqlTag:DbTag>
	</body>
</html>
