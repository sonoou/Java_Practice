import java.net.*;
import java.io.*;

public class MultiServer{
	ServerSocket ss;
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	MultiServer(){
		System.out.println("Server Started");
		try{
			ss = new ServerSocket(10);
			s = ss.accept();
			System.out.println("CLIENT CONNECTED");
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
		}
		catch(IOException e){
			System.out.println("MultiServer(): Can't get Input and Output Stream from Socket object");
		}
		Runnable rec = new Receiver(din);
		Thread t = new Thread(rec,"receiveServer");
		t.start();
		doChat();
	}
	class Receiver implements Runnable{
		DataInputStream din;
		Receiver(DataInputStream din){
			this.din = din;
		}
		public void run(){
			String str = " ";
			do{
				try{
					str = din.readUTF();
					System.out.println("\033[38;5;10mClient: "+str+"\033[0m");
				}
				catch(IOException e){
					System.out.println(e);
				}
			}while(!str.equals("stop"));
		}
	}
	void doChat(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = " ";
		do{
			try{
//				System.out.print("Input Message: ");
				s1 = br.readLine();
				dout.writeUTF(s1);
				dout.flush();
			}
			catch(IOException e){
				System.out.println("doChat(): Can't send your message");
			}
		}while(!s1.equals("stop"));
	}
	public static void main(String args[]){
		new MultiServer();
	}
}
