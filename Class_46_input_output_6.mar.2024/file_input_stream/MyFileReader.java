import java.io.*;

class MyFileReader{
	public static void main(String s1[])throws IOException{
		FileInputStream fr=new FileInputStream("lalu.txt");
		//FileInputStream fr=new FileInputStream(new File("/lalu2.txt"));

		int i=0;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		fr.close();
	}
}
