import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class LoginFilter implements Filter{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException{
		this.config = config;
	}
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException{
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		PrintWriter out = res.getWriter();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
			Statement s = c.createStatement();
			String s1 = "select * from emp101 where name='"+name+"' and pass='"+pass+"'";
			ResultSet rs = s.executeQuery(s1);
			if(rs.next()){
				chain.doFilter(req,res);
			}
			else{
				out.println("User is InValid");
			}
		}
		catch(Exception e){
			out.println(e);
		}
		out.println("loginfilter");
	}
	public void destroy(){
	}
}
