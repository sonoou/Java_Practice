class Pattern52{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=n;j>=i;j--){
				System.out.print((char)(64+i));
			}
		}
	}
	public static void main(String... s){
		Pattern52 p=new Pattern52();
		p.input();
		p.print();
	}
}
