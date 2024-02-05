class Pattern17{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				System.out.print((char)(65+n-i));
			}
		}
	}
	public static void main(String... s){
		Pattern17 p=new Pattern17();
		p.input();
		p.print();
	}
}
