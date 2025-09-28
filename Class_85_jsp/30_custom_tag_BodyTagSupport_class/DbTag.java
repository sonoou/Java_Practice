package my;

import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import java.io.*;

public class DbTag extends TagSupport{
	String driver;
	String url;
	String user;
	String pass;

	public void setDriver(String driver){
		this.driver = driver;
	}
	public String getDriver(){
		return this.driver;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setUser(String user){
		this.user = user;
	}
	public String getUser(){
		return this.user;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getPass(){
		return this.pass;
	}

	JspWriter out;
	public int doStartTag()throws JspException{
		try{
			out = pageContext.getOut();
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			pageContext.setAttribute("con",con,PageContext.APPLICATION_SCOPE);
		}
		catch(Exception e){
			try{
				out.println(e);
			}
			catch(Exception e1){ }
		}
		return EVAL_BODY_INCLUDE;
	}
}
