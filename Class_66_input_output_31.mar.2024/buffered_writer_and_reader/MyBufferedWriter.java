import java.io.*;

class MyBufferedWriter{
	public static void main(String args[])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		FileWriter fw = new FileWriter("abc11.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		String s = " ";
		while(!s.equals("stop")){
			s = br.readLine();
			//bw.write(s);
			//bw.write("  ");
			pw.println(s);
			//bw.flush();
		}
		br.close();
		bw.close();
		fw.close();
	}
}

class MyBufferedReader{
	public static void main(String args[])throws IOException{
		FileReader fr = new FileReader("abc11.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = " ";
		while(s != null){
			s = br.readLine();
			if(s != null){
				System.out.println(s);
			}
		}
	}
}
