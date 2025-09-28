class Pattern9{
	int n;

	void input(){
		System.out.println("Enter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n%2==0){
			System.out.println("only odd");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n-2;i+=2){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=1;j<=n;j++){
				if(i==1 || (j>=n/2-i/2+1 && j<=n/2+i/2+1)){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
		}
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=1;j<=n;j++){
				if(i==n || (j>=i/2+1 && j<=n-i/2)){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern9 p=new Pattern9();
		p.input();
		p.print();
	}
}
