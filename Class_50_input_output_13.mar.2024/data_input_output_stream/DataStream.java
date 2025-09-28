import java.io.*;

class DataStream{
	public static void main(String s1[])throws IOException{
		DataInputStream din = new DataInputStream(System.in);// now it is connected to keyboard
		FileOutputStream fout = new FileOutputStream("appsquadz4.txt");
		DataOutputStream dout = new DataOutputStream(fout);

		String s=" ";
		while(!s.equals("stop")){
			s = din.readLine();
			System.out.println(s);
			//dout.writeChars(s);
			//dout.writeBytes(s);
			dout.writeUTF(s);
			dout.flush();
		}
		din.close();
		dout.close();
	}
}
