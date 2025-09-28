import java.sql.*;
import java.io.*;

class OrderBy{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = s.executeQuery("SELECT * FROM Employee ORDER BY salary desc");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
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
