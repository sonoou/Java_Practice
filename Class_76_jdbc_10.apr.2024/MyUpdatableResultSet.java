import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyUpdatableResultSet{
	public static void main(String a[]){
		Statement st=null;
		ResultSet rs=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select accno, bal from  bank1");
			rs.next();
			rs.next();
			rs.deleteRow();
			System.out.println("record deleted");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
