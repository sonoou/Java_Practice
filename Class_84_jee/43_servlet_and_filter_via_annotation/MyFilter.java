import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebFilter(urlPatterns = {"/hello"}, filterName = "MyFilter")
public class MyFilter implements Filter{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException{
		this.config = config;
	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		out.println("MyFilter");
		ServletContext ctx = config.getServletContext();
		Integer count = (Integer)ctx.getAttribute("count");
		if(count == null){
			count = new Integer(0);
		}
		count = new Integer(count.intValue()+1);
		ctx.setAttribute("count",count);
		chain.doFilter(req,res);
		out.println("filter output");
	}
	public void destroy(){
	}
}
