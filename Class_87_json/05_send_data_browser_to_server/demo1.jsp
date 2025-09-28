<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="org.json.simple.parser.JSONParser" %>
<%@ page import="org.json.simple.parser.ParseException" %>
<%@ page import="org.json.simple.parser.ContainerFactory" %>

<%
	response.setContentType("text/html");
	String s = request.getParameter("data");
	//System.out.println(s);
	//out.println(s);
	FileWriter fw = new FileWriter("/home/sonu/Desktop/appsquadz.json");
	fw.write(s);
	fw.close();

	try{
		FileInputStream fr = new FileInputStream("/home/sonu/Desktop/appsquadz.json");
		byte b[] = new byte[fr.available()];
		fr.read(b);
		String data = new String(b);
		//System.out.println(data);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(s);
		JSONArray array = (JSONArray)obj;
		Iterator<JSONObject> iterator = array.iterator();
		while(iterator.hasNext()){
			//System.out.println(iterator.next());
			JSONObject jo = (JSONObject)iterator.next();
			Set s1 = jo.entrySet();
			Iterator i = s1.iterator();
			while(i.hasNext()){
				Map.Entry e = (Map.Entry)i.next();
				out.println(e.getKey()+" = "+e.getValue());
				out.println("<br>");
			}
			out.println("<br> next");
		}
	}
	catch(Exception pe){
		System.out.println(pe);
	}
	out.println("</body></html>");
%>
