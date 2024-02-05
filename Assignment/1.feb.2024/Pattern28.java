class Pattern28{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
		}
	}
	public static void main(String... s){
		Pattern28 p=new Pattern28();
		p.input();
		p.print();
	}
}
