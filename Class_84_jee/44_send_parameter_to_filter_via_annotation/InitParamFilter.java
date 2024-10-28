import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebFilter(urlPatterns = {"/hello"},
	initParams = { @WebInitParam(name = "simpleParam", value = "paramValue")})
public class InitParamFilter implements Filter{
	private FilterConfig filterConfig = null;
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)throws IOException, ServletException{
		String s = filterConfig.getInitParameter("simpleParam");
		res.getWriter().println("Myfilter1 "+s);
		chain.doFilter(req,res);
	}
	public void init(FilterConfig filterConfig)throws ServletException{
		this.filterConfig = filterConfig;
	}
	public void destroy(){
	}
}
