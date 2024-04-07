class Pattern7{
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
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=1;j<=n;j++){
				if(i==1 || j==1 || j==i || j==n-i+1 || j==n || i==n){
					System.out.print("# ");
				}
				else{
					System.out.print("  ");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern7 p=new Pattern7();
		p.input();
		p.print();
	}
}
