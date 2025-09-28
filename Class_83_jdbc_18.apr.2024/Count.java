import java.sql.*;
import java.io.*;
class Count{
	public static void main(String []ss){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet result = s.executeQuery("SELECT COUNT(emp.ename) FROM Employee emp");
			while(result.next()){
				System.out.println(result.getString(1));
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
