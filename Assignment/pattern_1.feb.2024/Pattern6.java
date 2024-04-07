class Pattern6{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		int ptrn=0;
		for(int i=1;i<=n;i++){
			ptrn=(i%2==0)?0:1;
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				System.out.print(ptrn);
			}
		}
	}
	public static void main(String... s){
		Pattern6 p=new Pattern6();
		p.input();
		p.print();
	}
}
