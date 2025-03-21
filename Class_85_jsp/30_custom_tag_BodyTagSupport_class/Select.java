package my;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import java.io.*;

public class Select extends BodyTagSupport{
	BodyContent bodyContent;

	public void setBodyContent(BodyContent bc){
		super.setBodyContent(bc);
		bodyContent = bc;
	}
	public int doStartTag()throws JspException{
		return EVAL_BODY_BUFFERED;
	}
	public int doEndTag()throws JspException{	
		try{
			JspWriter out = pageContext.getOut();
			Connection con = (Connection)pageContext.getAttribute("con",PageContext.APPLICATION_SCOPE);
			Statement s = con.createStatement();
			bodyContent = getBodyContent();

			String query = bodyContent.getString();
			ResultSet result1 = s.executeQuery(query.trim());
			while(result1.next()){
				out.println(result1.getString(1));
				out.println(result1.getString(2));
				out.println("<br>");
			}
		}
		catch(Exception e){	 	}
		return SKIP_BODY;
	}
}
