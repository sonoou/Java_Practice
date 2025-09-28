import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyFilterInitParam implements Filter{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException{
		this.config = config;
	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)throws ServletException,IOException{
		String s = config.getInitParameter("driver");
		config.getServletContext().setAttribute("name",s);
		res.getWriter().println("MyFilter1 "+s);
		chain.doFilter(req,res);
	}
	public void destroy(){
	}
}
