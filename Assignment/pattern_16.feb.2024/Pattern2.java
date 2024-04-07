class Pattern2{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=n;i>=1;i--){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
		}
	}
	public static void main(String... s){
		Pattern2 p=new Pattern2();
		p.input();
		p.print();
	}
}
