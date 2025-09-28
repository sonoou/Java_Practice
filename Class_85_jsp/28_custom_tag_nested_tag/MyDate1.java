package my;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import java.io.*;

public class MyDate1 extends TagSupport implements intr{
	JspWriter out;
	String name;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public int doStartTag()throws JspException{
		out = pageContext.getOut();
		try{
			out.println("Start Tag..");
			pageContext.setAttribute("user","scripting variable");
		}
		catch(Exception e){
			//empty
		}
		return EVAL_BODY_INCLUDE;
	}
	
	int count = 0;
	public int doAfterBody() throws JspException{
		if(++count < 5){
			return EVAL_BODY_AGAIN;
		}
		else{
			return SKIP_BODY;
		}
	}

	public int doEndTag()throws JspException{
		String s = new Date().toString();
		try{
			out.println(" Today's date: "+s+" | "+getName());
		}
		catch(Exception e){
			//empty
		}
		return EVAL_PAGE;
	}
}
