class Pattern3{
	int n;

	void input(){
		System.out.print("Enter a number(>=2): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n<2){
			System.out.println("Number must be >=2");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			System.out.print("@");
			for(int j=1;j<=(n-1)*i-(n-1);j++){
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				System.out.print("*");
				if(i==n && j==n){
					System.out.print("@");
				}
			}
		}
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=(n-1)*n+2;j++){
				System.out.print((j==1 && i==1)?"@":" ");
			}
			System.out.print("@");
		}
	}
	public static void main(String... s){
		Pattern3 p=new Pattern3();
		p.input();
		p.print();
	}
}
