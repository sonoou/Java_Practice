import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebFilter(urlPatterns = {"/hello"}, filterName = "MyFilter1")
public class MyFilter1 implements Filter{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException{
		this.config = config;
	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)throws ServletException, IOException{
		res.getWriter().println("hello filter2");
		chain.doFilter(req,res);
	}
	public void destroy(){
	}
}
