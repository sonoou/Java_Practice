class Pattern1{
	int n;

	void input(){
		System.out.print("Enter a number(only odd and >=5): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n%2==0 || n<5){
			System.out.println("Number must be odd and >=5");
			input();
		}
	}
	void print(){
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n-2;j+=2){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		}
		for(int i=1;i<=n/2+1;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				if(j==1 || j==n){
					System.out.print("@");
				}
				//else if(/*i>n/2+1 &&*/ j>(n/2-i/2+1) && j<(n/2+i/2+1)){
				//	System.out.print(j);
				//}
				else{
					System.out.print(" ");
				}
			}
		}
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				if(i<=n-2 && (j==1 || j==n)){
					System.out.print("@");
				}
				else if(j>=n/2-i/2+1 && j<=n/2+i/2+1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern1 p=new Pattern1();
		p.input();
		p.print();
	}
}
