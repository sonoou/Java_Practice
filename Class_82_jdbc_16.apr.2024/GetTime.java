import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class GetTime{
	public static void main(String args[])throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
		Statement st = con.createStatement();
		st.executeUpdate("drop table survey113");
		st.executeUpdate("create table survey113(id number(3), myDate TIMESTAMP)");
		String INSERT_RECORD = "insert into survey113(id,myDate) values(?,?)";

		PreparedStatement pstmt = con.prepareStatement(INSERT_RECORD);
		pstmt.setInt(1,1);
		java.sql.Time sqlTime = new java.sql.Time(new java.util.Date().getTime());
		pstmt.setTime(2,sqlTime);
		pstmt.executeUpdate();

		ResultSet rs = st.executeQuery("SELECT * FROM survey113");

		while(rs.next()){
			System.out.println(rs.getTime(2));
		}
		rs.close();
		st.close();
		con.close();
	}
}
