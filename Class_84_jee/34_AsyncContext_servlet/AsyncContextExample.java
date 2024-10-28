import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(asyncSupported = true, value = "/ace", loadOnStartup = 1)
public class AsyncContextExample extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException{
		doGet(req,res);
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println(Thread.currentThread().getName());
		AsyncContext asyncContext = req.startAsync();
		asyncContext.setTimeout(0);
		ServletRequest servReq = asyncContext.getRequest();
		boolean b = servReq.isAsyncStarted();
		out.println("isAsyncStarted: "+b);
		asyncContext.dispatch("/hello");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
		}
		out.println("<br/>asynchronous task finished.");
	}
}
