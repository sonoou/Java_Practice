package my;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import java.io.*;

public class MyDate1 extends TagSupport{
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
		}
		catch(Exception e){
			//empty
		}
		return EVAL_BODY_INCLUDE;
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
