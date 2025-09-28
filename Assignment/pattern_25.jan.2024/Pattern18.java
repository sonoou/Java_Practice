class Pattern18{
	int n;

	void input(){
		System.out.print("Enter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
		}
	}
	public static void main(String... s){
		Pattern18 p=new Pattern18();
		p.input();
		p.print();
	}
}
