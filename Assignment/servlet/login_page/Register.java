import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class Register extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connnection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Oracle10g");
        Statement stmt = con.createStatement();
        String userid = req.getParameter("userid");
        String phone = req.getParameter("phone");
        String pass = req.getParameter("pass");
        String addr = req.getParameter("address");
        String gender = req.getParameter("gender");
        String dob = req.getParameter("dob");
        String query = "insert into register values('"+userid+"','"+phone+"','"+pass+"','"+addr+"','"+gender+"'