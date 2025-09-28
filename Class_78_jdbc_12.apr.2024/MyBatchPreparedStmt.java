import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;

public class MyBatchPreparedStmt{
	public static void main(String args[]){
		Connection con = null;
		PreparedStatement pst = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			Statement s = con.createStatement();
			pst = con.prepareStatement("update emp101 set name=? where pass=?");
			pst.setString(1,"Gadar2");
			pst.setString(2,"Gader2");
			pst.addBatch();
			pst.setString(1,"jaddu2");
			pst.setString(2,"jaddu");
			pst.addBatch();
			int count[] = pst.executeBatch();
			ResultSet result1 = s.executeQuery("select * from emp101");
			while(result1.next()){
				System.out.println("Name "+result1.getString(1));
				System.out.println("Name "+result1.getString(2));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
