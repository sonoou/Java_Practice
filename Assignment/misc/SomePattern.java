import java.util.Scanner;

public class SomePattern{
	public static void main(String args[]){
		System.out.print("Enter a  number(only odd): ");
		int n = new Scanner(System.in).nextInt();

		for(int i=1; i<=n; i+=2){
			for(int j=n; j>=i; j-=2){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				if(j<=i/2+1){
					System.out.print(j);
				}
				else{
					System.out.print(i-j+1);
				}
			}
			System.out.println();
		}
	}
}
