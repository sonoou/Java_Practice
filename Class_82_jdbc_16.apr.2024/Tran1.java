import java.sql.*;
import java.io.*;

class Tran1{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();

			c.setAutoCommit(false);
			int x = s.executeUpdate("update emp101 set name='meesa' where pass='10feb'");
			ResultSet result1 = s.executeQuery("select * from emp101 where pass='10feb'");
			while(result1.next()){
				System.out.print("id: "+result1.getString(1)+" ");
				System.out.println("name: "+result1.getString(2));
			}
			c.rollback();
			System.out.println("after rollback");
			ResultSet result2 = s.executeQuery("select * from emp101 where pass='10feb'");
			while(result2.next()){
				System.out.print("id: "+result2.getString(1)+" ");
				System.out.println("name: "+result2.getString(2));
			}
			c.commit();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
