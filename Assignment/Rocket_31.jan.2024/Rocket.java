class Rocket{
	int n;

	void input(){
		System.out.print("\nEnter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
		if(n%2==0){
			System.out.print("Only odd number: ");
			input();
		}
	}
	void print(){
		//for piramid
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=n-1;j+=2){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		}
		// for @ symbol
		for(int i=1;i<=n-2;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				if(j==1 || j==n){
					System.out.print("@");
				}
				else{
					System.out.print(" ");
				}
			}
		}
		// for last two piramids
    for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i-1;j+=2){
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--){
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++){
					System.out.print(" ");
			}
			for(int j=1;j<=n;j++){
				if((i==1 && j==1) || (i==1 && j==n)){
					System.out.print("@");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
		}
	}
	public static void main(String... s){
		Rocket r=new Rocket();
		r.input();
		r.print();
	}
}
