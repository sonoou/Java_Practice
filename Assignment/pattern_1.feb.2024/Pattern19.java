class Pattern19{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n*n;i+=n){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=64+i;j<=64+n+i-1;j++){
				System.out.print((char)j);
			}
		}
	}
	public static void main(String... s){
		Pattern19 p=new Pattern19();
		p.input();
		p.print();
	}
}
