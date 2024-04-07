class Pattern12{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=n-i+1;j++){
				System.out.print(j+" ");
			}
			for(int j=n-i;j>=1;j--){
				System.out.print(j+" ");
			}
		}
	}
	public static void main(String... s){
		Pattern12 p=new Pattern12();
		p.input();
		p.print();
	}
}
