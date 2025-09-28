import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Part;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FileUpload", urlPatterns = {"/FileUpload"})
@MultipartConfig(location="/home/sonu/", fileSizeThreshold = 1024*1024, maxFileSize = 1024*1024*5, maxRequestSize = 1024*1024*5*5)
public class FileUpload extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		String filename = req.getParameter("filename");
		Part p = req.getPart("content");
		p.write(filename+".txt");
		if(req.getPart("content")!=null){
			PrintWriter out = res.getWriter();
			out.write("<html><body>");
			out.write("<h3>File uploaded successfully</h3>");
			out.write("</body></html>");
		}
	}
}
