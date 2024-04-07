class Pattern6{
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
			for(int j=i;j>=1;j--){
				System.out.print("\033[1;38;5;"+j+"m"+j);
			}
			for(int j=2;j<=i;j++){
				System.out.print("\033[1;38;5;"+j+"m"+j);
			}
			System.out.println("");
		}
	}
	public static void main(String... s){
		Pattern6 p=new Pattern6();
		p.input();
		p.print();
	}
}
