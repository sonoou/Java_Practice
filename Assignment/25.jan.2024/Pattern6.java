class Pattern6{
	int n;

	void input(){
		System.out.print("Enter  a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println();
			for(int j=i;j>=1;j--){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				System.out.print("\033[1;38;5;"+i+"m* ");
			}
		}
		for(int i=1;i<=n;i++){
			System.out.println();
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("\033[1;38;5;"+i+"m* ");
			}
		}
	}
	public static void main(String... s){
		Pattern6 p=new Pattern6();
		p.input();
		p.print();
	}
}
