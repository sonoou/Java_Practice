class Pattern31{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i*2-1;j>=i;j--){
				System.out.print((char)(64+j));
			}
		}
	}
	public static void main(String... s){
		Pattern31 p=new Pattern31();
		p.input();
		p.print();
	}
}
