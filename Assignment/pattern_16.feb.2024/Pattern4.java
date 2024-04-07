class Pattern4{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print( (i%2==0) ? 0 : 1 );
			}
		}
	}
	public static void main(String... s){
		Pattern4 p=new Pattern4();
		p.input();
		p.print();
	}
}
