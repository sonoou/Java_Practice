import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class FileUploadServlet2 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		try{
			res.setContentType("text/html");
			ServletInputStream in = req.getInputStream();
			ServletOutputStream out = res.getOutputStream();
			FileOutputStream fout = new FileOutputStream("/home/sonu/Desktop/upload.txt");
			int i=0;
			while((i = in.read()) != -1){
				fout.write(i);
				System.out.print((char)i);
			}
			fout.close();
			out.println("file uploaded");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
