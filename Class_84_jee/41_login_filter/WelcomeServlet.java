import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class WelcomeServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		HttpSession se = req.getSession(false);
		if(se == null){
			res.setHeader("Refresh","4;login.htm");
		}
		else{
			res.setHeader("Refresh","4;welcome.html");
		}
	}
}
