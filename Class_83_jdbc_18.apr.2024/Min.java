import java.sql.*;
import java.io.*;

class Min{
	public static void main(String []ss){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//ResultSet rs = s.executeQuery("SELECT MIN(employee.salary) FROM Employee employee");
			ResultSet rs = s.executeQuery("SELECT MAX(employee.salary) FROM Employee employee");
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
