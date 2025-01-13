<html>
<body>
	<%! int x=3;
		int square(int a){
			return a*a;
		}
	%>
	<%	int s = square(x);
		out.println(s);
	%>
	<%=	square(10) %>
</body>
</html>
