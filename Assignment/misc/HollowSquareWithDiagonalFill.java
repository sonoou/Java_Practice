import java.util.Scanner;

public class HollowSquareWithDiagonalFill{
	public static void main(String args[]){
		System.out.print("Enter a number(only odd): ");
		int n = new Scanner(System.in).nextInt();

		for(int i=1; i<=3; i++){
			for(int j=1; j<=n; j++){
				if(j==1 || j==n || j==n/2+1 || i==2){
					System.out.print(" *");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
