import java.sql.*;
import java.io.*;

class Sequence{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			//s.executeUpdate("CREATE SEQUENCE seq2047 INCREMENT BY 1 START WITH 100");
			//s.executeUpdate("DROP TABLE emp22");
			//s.executeUpdate("CREATE TABLE emp22(id NUMBER)");
			s.executeUpdate("insert into emp22 values(seq2047.nextval)");
			s.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
