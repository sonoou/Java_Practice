import java.util.Scanner;

public class PascalTriangle{
	public static void main(String args[]){
		System.out.print("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		int p[]={1,1};

		for(int i=1; i<=n; i++){
			int ptemp[] = new int[i+1];
			for(int j=i; j<=n; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				if(i==1 || j==i){
					System.out.print(" "+j);
				}
				else if(i==2){
					for(int k=0; k<p.length; k++){
						System.out.print(p[k]);
					}
				}
				else{
					
			}
			System.out.println();
		}
	}
}
