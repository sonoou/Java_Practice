class Pattern2{
	int n;

	void input(){
		System.out.print("\nEnter the number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		System.out.println("");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("\033[1;38;5;"+j+"m*");
			}
			System.out.println("");
		}
	}
	public static void main(String... s){
		Pattern2 p=new Pattern2();
		p.input();
		p.print();
	}
}
