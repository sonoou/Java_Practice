class Pattern24{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=n;i>=1;i--){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print(i);
			}
		}
	}
	public static void main(String... s){
		Pattern24 p=new Pattern24();
		p.input();
		p.print();
	}
}
