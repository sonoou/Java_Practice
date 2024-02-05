class Pattern33{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				if(j%2==0){
					System.out.print(0);
				}
				else{
					System.out.print(1);
				}
			}
		}
	}
	public static void main(String... s){
		Pattern33 p=new Pattern33();
		p.input();
		p.print();
	}
}
