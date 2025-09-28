class Pattern7{
	int n;

	void input(){
		System.out.print("Enter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n%2==0){
			System.out.println("\033[1;38;5;1mE: I said only odd number.\033[1;0m");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n;i+=2){
			System.out.println();
			for(int j=i;j<=n;j+=2){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(j>1 && j<i && i<n){
					System.out.print(" ");
				}
				else{
					System.out.print("\033[1;38;5;"+i+"m*");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern7 p=new Pattern7();
		p.input();
		p.print();
	}
}
