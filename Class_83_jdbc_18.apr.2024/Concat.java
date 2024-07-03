import java.sql.*;
import java.io.*;

class Concat{
	public static void main(String []ss){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			int t1=123;
			String t2="lalu";
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int x = s.executeUpdate("UPDATE Employee SET ename=CONCAT(ename,'A')");
			System.out.println(x);
		}
		catch(SQLException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
