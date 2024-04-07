class Pattern51{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=n;i>=1;i--){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j>=1;j--){
				System.out.print((char)(64+j));
			}
		}
	}
	public static void main(String... s){
		Pattern51 p=new Pattern51();
		p.input();
		p.print();
	}
}
