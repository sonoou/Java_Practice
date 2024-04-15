import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

class Pw{
	public static void main(String s[])throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter("abc.txt"));
		pw.println("hello");
		pw.println("hay");
		pw.close();
		System.out.println("File created");
	}
}
// PrintWriter(Writer w);
