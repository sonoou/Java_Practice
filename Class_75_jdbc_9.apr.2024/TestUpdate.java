import java.sql.*;
import java.util.*;

class TestUpdate{
	public static void main(String []ss){
		try{
			Driver d = new oracle.jdbc.driver.OracleDriver();
			Properties dbProp = new Properties();
			dbProp.put("user","System");
			dbProp.put("password","Oracle10g");
			Connection c = d.connect("jdbc:oracle:thin:@localhost:1521:xe",dbProp);
			String z = "hector";
			int t4 = 15452;
			Statement s = c.createStatement();
			int z1 = s.executeUpdate("update emp101 set salary='"+t4+"'where name='"+z+"'");
			System.out.println(z1);
			ResultSet result1 = s.executeQuery("select * from emp101");
			while(result1.next()){
				System.out.println(result1.getString(1)+" = "+result1.getString(2));
			}
		}
		catch(SQLException e){
			System.out.println(e);
		}
		catch(Exception i){
			System.out.println(i);
		}
	}
}