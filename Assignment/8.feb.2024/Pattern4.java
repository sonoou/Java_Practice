class Pattern4{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=1;j<=i;j++){
				System.out.print("# ");
			}
		}
	}
	public static void main(String... s){
		Pattern4 p=new Pattern4();
		p.input();
		p.print();
	}
}
