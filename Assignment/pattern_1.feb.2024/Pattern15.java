class Pattern15{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n+i-1;j++){
				System.out.print((char)(64+j));
			}
		}
	}
	public static void main(String... s){
		Pattern15 p=new Pattern15();
		p.input();
		p.print();
	}
}
