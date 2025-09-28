<%! int day = 2; %>
<html>
<body>
<%
	switch(day){
		case 0:
%>
				<font color="red" size="10">
					JSP Tutorial
				</font>
				<br>
<%				break;
		case 1:
%>
				<font color="red" size="10">
					It's MONDAY
				</font>
				<br>
<%				break;
		case 2:
%>
				<font color="red" size="10">
					It's TUESDAY
				</font>
				<br>
<%				break;
		case 3:
%>
				<font color="red" size="10">
					It's WEDNESDAY
				</font>
				<br>
<%				break;
		case 4:
%>
				<font color="red" size="10">
					It's THURSDAY
				</font>
				<br>
<%				break;
		case 5:
%>
				<font color="red" size="10">
					It's FRIDAY
				</font>
				<br>
<%				break;
		case 6:
%>
				<font color="red" size="10">
					It's SATURDAY
				</font>
				<br>
<%				break;
		default:
%>
				<font color="red" size="10">
					Its MONDAY
				</font>
				<br>
<%
	}
%>
</body>
</html>
			
