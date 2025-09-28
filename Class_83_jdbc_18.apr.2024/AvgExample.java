import java.sql.*;
import java.io.*;

class AvgExample{
	public static void main(String []ss){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			int t1=123;
			String t2="lalu";
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = s.executeQuery("SELECT * FROM Employee WHERE Salary > (SELECT AVG(emp2.Salary) FROM Employee emp2)");
			while(result.next()){
				System.out.println(result.getString(1)+" "+result.getString(2));
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
