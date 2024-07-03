import java.sql.*;
import java.io.*;

class Tran{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			c.setAutoCommit(false);
			int x = s.executeUpdate("update emp101 set name='rabari11' where pass='10feb'");
			ResultSet result1 = s.executeQuery("select * from emp101 where pass='10feb'");
			while(result1.next()){
				System.out.print("name "+result1.getString(1)+" ");
				System.out.println("pass "+result1.getString(2));
			}
			c.commit();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
