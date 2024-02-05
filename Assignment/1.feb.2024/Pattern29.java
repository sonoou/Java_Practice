class Pattern29{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		int ptrn=1,j=1;
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(j=ptrn;j<=ptrn+i-1;j++){
				if(j>=1 && j<=9){
					System.out.print(0);
				}
				System.out.print(j+" ");
			}
			ptrn=j;
		}
	}
	public static void main(String... s){
		Pattern29 p=new Pattern29();
		p.input();
		p.print();
	}
}

