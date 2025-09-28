import java.sql.*;
import java.io.*;

class SavePoint{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();

			c.setAutoCommit(false);
			int x = s.executeUpdate("update emp101 set name='meesa' where pass='10feb'");
			s.executeUpdate("insert into emp101 values('dhonicsk2025','dhonicsk2025')");

			Savepoint savept = c.setSavepoint("aaa");

			int x1 = s.executeUpdate("delete from emp101 where pass='jaddu'");
			s.executeUpdate("insert into emp101 values('pappu','rahul')");
			c.rollback(savept);

			//c.createSavepoint(savept);

			c.commit();
			ResultSet result1 = s.executeQuery("select * from emp101");
			while(result1.next()){
				System.out.print("id: "+result1.getString(1)+" ");
				System.out.println("name: "+result1.getString(2));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
