class Pattern21{
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
				System.out.print(j);
			}
			for(int j=i*2-2;j>=i;j--){
				System.out.print(j);
			}
		}
	}
	public static void main(String... s){
		Pattern21 p=new Pattern21();
		p.input();
		p.print();
	}
}
