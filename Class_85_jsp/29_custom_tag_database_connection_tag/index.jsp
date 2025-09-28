<%@ taglib prefix="SqlTag" uri="/WEB-INF/tlds/db.tld" %>
<html>
	<body>
		<SqlTag:DbTag driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="system" pass="Oracle10g" >
			<SqlTag:Insert query="insert into emp65 values('30','23feb')" />
			<SqlTag:Update query="update emp65 set name='Sun' where id='2022'" />
			<SqlTag:Delete query="delete from emp65 where id='9097'" />
			<SqlTag:Select query="select * from emp65" />
		</SqlTag:DbTag>
	</body>
</html>
