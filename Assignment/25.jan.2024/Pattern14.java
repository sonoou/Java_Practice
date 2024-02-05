class Pattern14{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		boolean dash=false;
		for(int i=1;i<=n-1;i++){
			System.out.println();
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(dash==false){
					System.out.print("\033[1;38;5;"+i+"m* ");
				}
				else{
					System.out.print("\033[1;38;5;"+i+"m- ");
				}
			}
			dash=(dash==false)?true:false;
		}
		for(int i=1;i<=n;i++){
			System.out.println();
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				if(dash==false){
					System.out.print("\033[1;38;5;"+i+"m* ");
				}
				else{
					System.out.print("\033[1;38;5;"+i+"m- ");
				}
			}
			dash=(dash==false)?true:false;
		}
	}
	public static void main(String... s){
		Pattern14 p=new Pattern14();
		p.input();
		p.print();
	}
}
