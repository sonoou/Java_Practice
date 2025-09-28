class Pattern5{
	int n;

	void input(){
		System.out.print("\nEnter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		System.out.println("");
		for(int i=1;i<=n;i++){
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("\033[1;38;5;"+i+"m"+i);
			}
			for(int j=1;j<=i-1;j++){
				System.out.print("\033[1;38;5;"+i+"m"+i);
			}
			System.out.println("");
		}
	}
	public static void main(String... s){
		Pattern5 p=new Pattern5();
		p.input();
		p.print();
	}
}
