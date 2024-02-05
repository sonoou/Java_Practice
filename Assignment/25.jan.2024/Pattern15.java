class Pattern15{
	int n;

	void input(){
		System.out.print("Enter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i+=2){
			System.out.println();
			for(int j=i;j<=n;j+=2){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(j>1 && j<i){
					System.out.print("\033[1;38;5;"+i+"m-");
				}
				else{
					System.out.print("\033[1;38;5;"+1+"m*");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern15 p=new Pattern15();
		p.input();
		p.print();
	}
}
