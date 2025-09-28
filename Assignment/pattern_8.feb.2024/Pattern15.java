class Pattern15{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=i;j<=n-1;j++){
				System.out.print("    ");
			}
			for(int j=1;j<=i;j++){
				if(Math.pow(2,j-1)<=9){
					System.out.print("   ");
				}
				else if(Math.pow(2,j-1)<=99){
					System.out.print("  ");
				}
				else{
					System.out.print(" ");
				}
				System.out.print((int)Math.pow(2,j-1));
			}
			for(int j=i-1;j>=1;j--){
				if(Math.pow(2,j-1)<=9){
					System.out.print("   ");
				}
				else if(Math.pow(2,j-1)<=99){
					System.out.print("  ");
				}
				else{
					System.out.print(" ");
				}
				System.out.print((int)Math.pow(2,j-1));
			}
		}
	}
	public static void main(String... s){
		Pattern15 p=new Pattern15();
		p.input();
		p.print();
	}
}
