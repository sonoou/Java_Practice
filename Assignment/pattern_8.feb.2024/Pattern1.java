class Pattern1{
	String s;

	void input(){
		System.out.print("Enter a string: ");
		s=new java.util.Scanner(System.in).next();
	}
	void print(){
		int n=s.length();
		for(int i=1;i<=n/2+1;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				//if(j==i || j==n-i){
					System.out.print("* ");
				//}
				//else{
				//	System.out.print("  ");
				//}
			}
		}
		for(int i=1;i<=n;i+=2){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j+=2){
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				if(j==i || j==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
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
