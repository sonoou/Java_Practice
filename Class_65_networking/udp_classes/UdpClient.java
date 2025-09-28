import java.net.*;
import java.io.*;

class UdpClient{
	public static void main(String args[])throws IOException{
		DatagramSocket ds = new DatagramSocket();
		String s = "India is a good country";
		byte b[]=s.getBytes();
		InetAddress i = InetAddress.getLocalHost();
		DatagramPacket dp = new DatagramPacket(b,b.length,i,8);
		ds.send(dp);
	}
}
