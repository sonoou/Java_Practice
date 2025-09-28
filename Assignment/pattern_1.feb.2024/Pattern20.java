class Pattern20{
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
					System.out.print((char)(64+j));
				}
				else{
					System.out.print("*");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern20 p=new Pattern20();
		p.input();
		p.print();
	}
}
