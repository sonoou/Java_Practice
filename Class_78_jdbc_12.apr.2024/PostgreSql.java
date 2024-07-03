import java.sql.*;
import java.io.*;

class PostgreSql{
	public static void main(String args[]){
		try{
			Class.forName("org.postgresql.Driver");
			Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testpost","sonu","15061999");
			String t1="virat";
			int t2=100000;

			Statement s=c.createStatement();
			//s.executeUpdate("create table emp162(name varchar(20),salary int)");
			PreparedStatement ps = c.prepareStatement("insert into emp162 values(?,?)");
			ps.setString(1,t1);
			ps.setInt(2,t2);
			ps.executeUpdate();
			ps.close();
			
			ResultSet result1=s.executeQuery("select * from emp162");

			while(result1.next()){
				System.out.println("name: "+result1.getString(1));
				System.out.println("salary: "+result1.getString(2));
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
