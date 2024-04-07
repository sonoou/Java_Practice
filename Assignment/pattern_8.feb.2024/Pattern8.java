class Pattern8{
	int n;

	void input(){
		System.out.print("Enter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n%2==0){
			System.out.println("only odd");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=1;j<=i;j+=2){
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				System.out.print("# ");
			}
		}
	}
	public static void main(String... s){
		Pattern8  p=new Pattern8();
		p.input();
		p.print();
	}
}
