class Pattern1{
	int n;

	void input(){
		System.out.print("\nEnter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		System.out.println("");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n*2+2);j++){
				System.out.print("\033[1;38;5;"+i+"m*");
			}
			System.out.println("");
		}
	}
	public static void main(String... s){
		Pattern1 p=new Pattern1();
		p.input();
		p.print();
	}
}
