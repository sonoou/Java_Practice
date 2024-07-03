import java.sql.*;
import java.io.*;

class Lower{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//int x=s.executeUpdate("UPDATE Employee SET ename = LOWER(ename)");
			int x=s.executeUpdate("UPDATE Employee SET ename = UPPER(ename)");
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
