import java.io.*;
import java.sql.*;

public class ImageInsert{
	public static void main(String args[])throws Exception{
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/appsquadz56","appsquadz56","appsquadz56");
		Statement st = con.createStatement();
		st.executeUpdate("drop table image18");
		st.executeUpdate("create table image18(name varchar(15),image blob)");
		File file=new File("bg.png");
		FileInputStream fis=new FileInputStream(file);
		PreparedStatement ps=con.prepareStatement("insert into image18 values(?,?)");
		ps.setString(1,"Altron");
		ps.setBinaryStream(2,fis,(int)file.length());
		ps.execute();
		ps.close();
		fis.close();
	}
}
