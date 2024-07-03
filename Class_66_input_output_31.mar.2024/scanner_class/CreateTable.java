import java.io.FileInputStream;
import java.util.Scanner;

public class CreateTable{
	public static void main(String args[]){
		try{
			//FileInputStream fin = new FileInputStream
			FileInputStream fin = new FileInputStream("lalu.txt");
			Scanner sc = new Scanner(fin);
			sc.useDelimiter("/");
			String name = " ";
			while(sc.hasNext()){
				name = sc.next();
				System.out.print(name);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
