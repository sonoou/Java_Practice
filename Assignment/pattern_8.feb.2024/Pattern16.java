import java.util.Scanner;

class Pattern16{
	public static void main(String... s){
		System.out.print("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		int p[] = {1,1};

		for(int i=1; i<=n; i++){
			int ptemp[] = new int[i];
			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print("   1");
					if(i>=3){
						ptemp[j-1] = 1;
					}
				}
				else{
					ptemp[j-1] = p[j-2] + p[j-1];
					System.out.print(ptemp[j-1]<10?"   "+ptemp[j-1]:"  "+ptemp[j-1]);
				}
			}
			System.out.println();
			if(i>=3){
				p=ptemp;
			}
		}
	}
}
