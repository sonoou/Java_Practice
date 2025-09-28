class Pattern44{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--){
				System.out.print(j);
			}
		}
	}
	public static void main(String... s){
		Pattern44 p=new Pattern44();
		p.input();
		p.print();
	}
}
