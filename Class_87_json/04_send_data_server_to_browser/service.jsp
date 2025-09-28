<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="org.json.simple.JSONObject" %>

<%
	JSONObject obj = new JSONObject();
	obj.put("name","lalu");
	obj.put("salary",new Integer(100));
	obj.put("balance",new Integer(200));
	obj.put("is_vip",new Boolean(true));
	obj.put("nickname","Bhalu");
	out.print(obj);
	out.flush();
%>
