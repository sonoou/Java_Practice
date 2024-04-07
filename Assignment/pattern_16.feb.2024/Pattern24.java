class Pattern24{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=i*2-1;j++){
				System.out.print((char)(64+j));
			}
			for(int j=i*2-2;j>=i;j--){
				System.out.print((char)(64+j));
			}
		}
	}
	public static void main(String... s){
		Pattern24 p=new Pattern24();
		p.input();
		p.print();
	}
}
