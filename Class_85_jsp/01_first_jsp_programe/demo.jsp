<html>
<body>
	<%! int hit=0; %>
	<%
		hit++;
		Runtime rn = Runtime.getRuntime();
		rn.exec("mkdir /home/sonu/Desktop/"+hit);
		out.println("Directory name: "+hit+" will be deleted in 5 seconds<br>");
		out.println(hit+"<br>");
		out.println("Hello jsp<br>");
		out.println(Thread.currentThread().getName());
		Thread.sleep(1000*5);
		rn.exec("rm -r /home/sonu/Desktop/"+hit);
		out.println("Directory deleted succesfully");
	%>
</body>
</html>
