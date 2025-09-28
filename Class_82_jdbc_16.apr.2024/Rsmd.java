import java.sql.*;

class Rsmd{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = c.createStatement();
			ResultSet result1 = s.executeQuery("select * from emp101");
			ResultSetMetaData rsmd = result1.getMetaData();
			int count = rsmd.getColumnCount();
			System.out.println("Total columns: "+count);
			for(int i=1;i<=count;i++){
				System.out.print(rsmd.getColumnName(i)+" ");
				System.out.println(rsmd.getColumnTypeName(i));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		catch(Exception i){
			System.out.println(i);
		}
	}
}
