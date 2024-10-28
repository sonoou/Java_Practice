import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class LogFilter implements Filter{
	private FilterConfig filterConfig = null;
	public void doFilter(ServletRequest req,ServletResponse res, FilterChain chain)throws IOException, ServletException{
		long start = System.currentTimeMillis();
		String address = req.getRemoteAddr();
		String file = ((HttpServletRequest)req).getRequestURI();
		filterConfig.getServletContext().log(
			"User access! \n"+
			"User IP: "+address+"\n"+
			"Resource: "+file+"\n"+
			"Milliseconds used: "+(System.currentTimeMillis() - start)
		);
		chain.doFilter(req,res);
		PrintWriter out = res.getWriter();
		out.println("log filter");
	}
	public void destroy(){
	}
	public void init(FilterConfig filterConfig){
		this.filterConfig = filterConfig;
	}
}
