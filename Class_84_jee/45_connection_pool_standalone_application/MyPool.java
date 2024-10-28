import javax.naming.*;
import java.util.*;
import java.sql.*;
import javax.sql.*;

class MyPool{
	public static void main(String args[]){
		try{
			Properties parm = new Properties();
			parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
			parm.setProperty("java.naming.provider.url","t3://localhost:7001");
			parm.setProperty("java.naming.security.principal","weblogic");
			parm.setProperty("java.naming.security.credentials","Weblogic12c");
			InitialContext ctx = new InitialContext(parm);
			DataSource ds = (DataSource)ctx.lookup("tindi");
			Connection con = ds.getConnection();
			Statement s = con.createStatement();
			ResultSet result = s.executeQuery("select * from emp101");
			while(result.next()){
				System.out.println("id: "+result.getString(1));
				System.out.println("name: "+result.getString(2));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
