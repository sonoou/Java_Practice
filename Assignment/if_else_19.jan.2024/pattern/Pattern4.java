class Pattern4{
	int n;

	void input(){
		System.out.print("\nEnter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		System.out.println("");
		for(int i=1;i<=n;i+=2){
			for(int j=n;j>=i;j-=2){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("\033[1;38;5;"+i+"m*");
			}
			// for(int j=1;j<=i-1;j++){
			// 	System.out.print("\033[1;38;5;"+i+"m*");
			// }
			System.out.println("");
		}
	}
	public static void main(String... s){
		Pattern4 p=new Pattern4();
		p.input();
		p.print();
	}
}
