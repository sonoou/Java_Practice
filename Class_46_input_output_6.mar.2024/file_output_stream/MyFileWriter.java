import java.io.*;

class MyFileWrite{
	public static void main(String... a)throws IOException{
		//FileOutputStream fw=new FileOutputStream("abc.txt");//write mode
		//FileOutputStream fw=new FileOutputStream("abc.txt",true);//Append mode

		//create file on particular location
		//FileOutputStream fw=new FileOutputStream(new File("/lalu2.txt"));//Write mode
		FileOutputStream fw=new FileOutputStream(new File("/lalu2.txt"),true);//Append mode

		String s="India is good country in world";

		byte ch[]=s.getBytes();
		fw.write(ch);
//		for(int i=0;i<ch.length;i++){
//			fw.write(ch[i]);
//		}
		fw.close();
		System.out.println("File Created Successfully");
	}
}
