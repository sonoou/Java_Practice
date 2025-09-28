class Pattern16{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=64+n+i-1;j>=65+i-1;j--){
				System.out.print((char)j);
			}
		}
	}
	public static void main(String... s){
		Pattern16 p=new Pattern16();
		p.input();
		p.print();
	}
}
