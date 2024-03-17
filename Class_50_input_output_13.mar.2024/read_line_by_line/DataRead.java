import java.io.*;

class DataRead{
	public static void main(String s1[])throws IOException{
		DataInputStream din = new DataInputStream(new FileInputStream("appsquadz4.txt"));
		String s=" ";
		while(s!=null){
			s = din.readLine();
			if(s!=null){
				System.out.println(s);
			}
		}
		din.close();
	}
}

