import java.util.Scanner;

public class FloydTriangle{
	public static void main(String args[]){
		System.out.print("Enter a number: ");
		int n = new Scanner(System.in).nextInt();

		int p = 1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(p<10?"  ":" ");
				System.out.print(p++);
		 	}
			System.out.println();
		}
	}
}
