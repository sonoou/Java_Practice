import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.text.DateFormat;

public class ImageServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		String fileName = "Altron.jpg";
		ServletOutputStream stream = null;
		BufferedInputStream buf = null;
		stream = res.getOutputStream();
		String s1 = getServletContext().getRealPath("/files/bg.png");
		File doc = new File(s1);
		res.setContentType("image/jpeg");
		res.addHeader("Content-Disposition","attachment; filename="+fileName);
		res.setContentLength((int)doc.length());
		FileInputStream input = new FileInputStream(doc);
		buf = new BufferedInputStream(input);
		int readBytes = 0;
		while((readBytes = buf.read())!=-1){
			stream.write(readBytes);
		}
	}
}
