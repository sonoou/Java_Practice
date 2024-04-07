class Pattern4{
	int n;

	void input(){
		System.out.print("Enter a number(only even and >=2: ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n<2 || n%2!=0){
			System.out.println("Only even and >=2");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n/2;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			System.out.print("@");
		}
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			System.out.print((i<=n/2+1)?"@":" ");
			for(int j=1;j<=(n-1)*i-(n-1);j++){
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			if(i>=n/2){
				for(int j=(n-1)*(n-i);j>=1;j--){
					System.out.print(" ");
				}
				System.out.print("@");
			}
		}
		for(int i=1;i<=n/2;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n*(n-1)+2;j++){
				System.out.print(" ");
			}
			System.out.print("@");
		}
	}
	public static void main(String... s){
		Pattern4 p=new Pattern4();
		p.input();
		p.print();
	}
}
