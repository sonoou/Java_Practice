class Pattern20{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
		//if(n%2==0){
		//	System.out.println("only odd");
		//	input();
		//}
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--){
				System.out.print(j);
			}
		}
	}
	public static void main(String... s){
		Pattern20 p=new Pattern20();
		p.input();
		p.print();
	}
}
