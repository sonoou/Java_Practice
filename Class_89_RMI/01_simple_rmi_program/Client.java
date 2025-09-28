import my.*;
import java.rmi.*;
import java.rmi.server.*;

public class Client{
	public static void main(String args[]){
		try{
			my.MyRemote m = (my.MyRemote)Naming.lookup("rmi://localhost:1099/appsquadz");
			System.out.println(m.add(12,12));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
