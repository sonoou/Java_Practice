class Pattern40{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				if(i==1 || j==1 || j==n || i==n){
					System.out.print(" ");
				}
				else{
					System.out.print("  ");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern40 p=new Pattern40();
		p.input();
		p.print();
	}
}
