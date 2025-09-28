import java.util.Scanner;

class LCM{
	public static void main(String... s){
		int ans=1;
		boolean multipy=false,incDivisor=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of input: ");
		int a=nextInt();

		for(int i=0;i<inp.length;i++){
			System.out.println("Enter "+(i+1)+"  number: ");
			inp[i]=sc.nextInt();
		}

		for(int i=0;i<inp.length;i++){
			incDivisor=true;
			if((inp[i]%divisor)==0){
				inp[i]=inp[i]/2;
				ans*=divisor;
				incDivisor=false;
			}

			for(int j=0;j<inp.length;j++){
				if(inp[i]%
