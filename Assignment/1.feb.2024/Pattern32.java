class Pattern32{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(j);
				}
				else{
					System.out.print("*");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern32 p=new Pattern32();
		p.input();
		p.print();
	}
}
