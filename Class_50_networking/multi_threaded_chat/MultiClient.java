import java.net.*;
import java.io.*;

public class MultiClient{
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	MultiClient(){
		try{
			s = new Socket("localhost",10);
		    din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
		}
		catch(IOException e){
			System.out.println(e);
		}
		Runnable rec = new Receiver(din);
		Thread t = new Thread(rec,"receiveClient");
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
					System.out.println("\033[38;5;9mServer: "+str+"\033[0m");
				}
				catch(EOFException e){
					System.out.println("Server disconnected");
					break;
				}
				catch(IOException e){
					System.out.println(e);
				}
			}while(!str.equals("stop"));
		}
	}
	void doChat(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		do{
			try{
//				System.out.print("Input Message: ");
				str = br.readLine();
				dout.writeUTF(str);
				dout.flush();
			}
			catch(IOException e){
				System.out.println(e);
			}
		}while(!str.equals("stop"));
	}
	public static void main(String args[]){
		new MultiClient();
	}
}
