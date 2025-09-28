<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>

<%
	try{
		response.setContentType("image/png");
		response.setHeader("Content-disposition","attachment;filename=back.png");
		String path = application.getRealPath("dt")+"/back.png";
		File ff = new File(path);
		byte b[] = new byte[(int)ff.length()];
		FileInputStream pp = new FileInputStream(ff);
		pp.read(b);
		OutputStream os = response.getOutputStream();
		os.write(b);
	}
	catch(Exception e){
		System.out.println(e);
	}
%>
