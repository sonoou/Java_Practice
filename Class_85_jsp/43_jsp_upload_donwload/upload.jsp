<%@ page import="java.io.*" %>
<%@ page import="com.oreilly.servlet.*" %>

<%
	try{
	//	MultipartRequest mpr = new MultipartRequest(request, application.getRealPath("dt"),500*1024*1024);
	MultipartRequest mpr = new MultipartRequest(request,"/home/sonu",500*1024*1024);
		String s1 = mpr.getOriginalFileName("file");
		out.println("file uploaded successfully = "+s1);
	}
	catch(Exception e){
		out.print(e);
	}
%>
