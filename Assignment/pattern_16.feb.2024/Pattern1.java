import java.util.Scanner;

class Pattern1{
	int n;

	void input(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=s.nextInt();
	}
	void print(){
		for(int i=n;i>=1;i--){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				System.out.print((char)(64+i));
			}
		}
	}
	public static void main(String... s){
		Pattern1 p=new Pattern1();
		p.input();
		p.print();
	}
}
