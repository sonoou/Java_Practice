<%@ page isThreadSafe="false" %>
<html>
<body>
	<%
		out.println(Thread.currentThread().getName());
	%>
	<br>
	<%
		out.println(this);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
		}
	%>
</body>
</html>
