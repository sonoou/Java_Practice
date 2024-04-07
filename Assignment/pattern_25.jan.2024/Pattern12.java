class Pattern12{
	int n;

	void input(){
		System.out.print("Enter a number(only odd): ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		boolean dash=false;
		for(int i=1;i<=n-1;i+=2){
			System.out.println();
			for(int j=i;j<=n;j+=2){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(dash==false){
					System.out.print("\033[1;38;5;"+i+"m*");
				}
				else{
					System.out.print("\033[1;38;5;"+i+"m-");
				}
			}
			if(dash==false){
				dash=true;
			}
			else{
				dash=false;
			}
		}
		for(int i=1;i<=n;i+=2){
			System.out.println();
			for(int j=1;j<=i;j+=2){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				if(dash==false){
					System.out.print("\033[1;38;5;"+i+"m*");
				}
				else{
					System.out.print("\033[1;38;5;"+i+"m-");
				}
			}
			if(dash==false){
				dash=true;
			}
			else{
				dash=false;
			}
		}
	}
	public static void main(String... s){
		Pattern12 p=new Pattern12();
		p.input();
		p.print();
	}
}
