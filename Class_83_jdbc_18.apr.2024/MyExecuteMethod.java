import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyExecuteMethod{
	public static void main(String args[]){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement stmt = con.createStatement();
			//The query can be update query or can be select queury
			String update="update emp101 set name='rikusingh' where pass='10feb'";
			String query="select * from emp101";
			boolean status1 = stmt.execute(update);
			int count = stmt.getUpdateCount();
			System.out.println("Total records updated: "+count);
			boolean status = stmt.execute(query);
			if(status){
				//query is a select query.
				ResultSet rs = stmt.getResultSet();
				while(rs.next()){
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
				}
				rs.close();
			}
		}
		catch(Exception e){

		}
	}
}
