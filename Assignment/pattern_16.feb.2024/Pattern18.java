class Pattern18{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		int p=1;
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print("   ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(((p<=9)?"  ":" ")+p);
				p++;
			}
		}
	}
	public static void main(String... s){
		Pattern18 p=new Pattern18();
		p.input();
		p.print();
	}
}
