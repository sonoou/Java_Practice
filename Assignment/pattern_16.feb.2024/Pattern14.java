class Pattern14{
	int n;

	void input(){
		System.out.print("Enter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n%2==0){
			System.out.print("only odd");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j+=2){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
		}
	}
	public static void main(String... s){
		Pattern14 p=new Pattern14();
		p.input();
		p.print();
	}
}
