import java.io.*;

class Ps{
	public static void main(String s[])throws IOException{
		FileOutputStream fout = new FileOutputStream("chachi.txt");
		PrintStream ps = new PrintStream(fout);

		FileOutputStream fout1 = new FileOutputStream("chacha.txt",true);
		PrintStream ps1 = new PrintStream(fout1);

		System.out.println("before"); // Here [out] of [PrintStream] class is connected to console

		PrintStream ps4 = System.out;
		System.setOut(ps);  // now connected to fout
		System.setErr(ps1); // now connected to fout1

		System.out.println("chachi 420");
		System.out.println("chachi 840");
		System.err.println("chacha 420");
		System.err.println("chacha 840");
		// System.out = ps4;
		System.setOut(ps1);
		System.out.println("chacha 240");
		System.setOut(ps4);
		ps4.println("after");
		System.out.println("via actual out");
	}
}

