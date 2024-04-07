class Pattern2{
	int n;

	void input(){
		System.out.print("Enter a number(>=2): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n<2){
			System.out.println("number must be >=2");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n+1;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			System.out.print("@");
		}
		//System.out.println();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-1)*i-(n-1);j++){
				if(i>1){
					System.out.print(" ");
				}
			}
			for(int j=1;j<=n;j++){
				System.out.print("*");
				if(j==n && i==n){
					System.out.print("@");
				}
			}
			System.out.print("\n\033[1;38;5;"+i+"m ");
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-1)*n+1;j++){
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.print("\n\033[1;38;5;"+i+"m ");
		}
		//	for(int j=1;j<=n;j++){
		//		System.out.print("@");
		//	}
		//	System.out.print("\n\033[1;38;5;"+i+"m ");
		//}
	}
	public static void main(String... s){
		Pattern2 p=new Pattern2();
		p.input();
		p.print();
	}
}
