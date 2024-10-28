import java.io.*;
import java.net.*;

public class MyServer{
	ServerSocket ss;
	Socket s;
	ObjectInputStream dis;

	public MyServer(){
		try{
			ss = new ServerSocket(8);
			//s = new ServerSocket(8);
			s = ss.accept();
			System.out.println("CLIENT CONNECTED");
			dis = new ObjectInputStream(s.getInputStream());
			emp z = (emp)dis.readObject();
			z.show();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String args[]){
		new MyServer();
	}
}
