import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyFilter1 implements Filter{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException{
		this.config = config;
	}
	public void doFilter(ServletRequest req,ServletResponse res, FilterChain chain)throws ServletException,IOException{
		res.getWriter().println("MyFilter1 via aate hua");
		res.getWriter().println("<br>");
		chain.doFilter(req,res);
		res.getWriter().println("<br>");
		res.getWriter().println("MyFilter1 reponse aate hua");
		res.getWriter().println("<br>");
	}
	public void destroy(){
	}
}
