class Pattern14{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		int ptrn=0;
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			ptrn=(i%2==0)?0:1;
			for(int j=1;j<=n;j++){
				System.out.print(ptrn);
				ptrn=(ptrn==0)?1:0;
			}
		}
	}
	public static void main(String... s){
		Pattern14 p=new Pattern14();
		p.input();
		p.print();
	}
}
