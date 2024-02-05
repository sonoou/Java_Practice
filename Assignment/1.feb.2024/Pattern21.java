class Pattern21{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				if(i%2==0){
					System.out.print((char)(96+j));
				}
				else{
					System.out.print((char)(64+j));
				}
			}
		}
	}
	public static void main(String... s){
		Pattern21 p=new Pattern21();
		p.input();
		p.print();
	}
}
