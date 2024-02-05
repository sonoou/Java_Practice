class Pattern37{
	int n;

	void input(){
		System.out.print("Enter a numer: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
		}
	}
	public static void main(String... s){
		Pattern37 p=new Pattern37();
		p.input();
		p.print();
	}
}
