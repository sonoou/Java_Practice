import java.util.Scanner;

public class DivideHollowDiamondPattern{
	public static void main(String args[]){
		System.out.print("Enter a number(only odd): ");
		int n = new Scanner(System.in).nextInt();

		for(int i=1; i<=n-2; i+=2){
			for(int j=n; j>=i; j-=2){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print((j>1 && j<i)?" ":"*");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i-=2){
			for(int j=i; j<=n; j+=2){
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--){
				System.out.print((j<i && j>1 && i<n)?" ":"*");
			}
			System.out.println();
		}
	}
}
