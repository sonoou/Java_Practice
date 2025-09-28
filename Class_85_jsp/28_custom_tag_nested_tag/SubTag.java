package my;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
import java.io.*;

public class SubTag extends TagSupport{
	private String xyz;
	public int doStartTag() throws JspException{
		JspWriter out = pageContext.getOut();
		intr z = (intr)TagSupport.findAncestorWithClass(this,intr.class);
		xyz = z.getName();
		try{
			out.println(xyz+" sub");
		}
		catch(IOException e){   }
		return SKIP_BODY;
	}
}
