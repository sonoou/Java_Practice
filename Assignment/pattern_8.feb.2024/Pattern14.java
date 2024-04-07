class Pattern14{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		int p=1;
		for(int i=1;i<=n;i++){
			p=i;
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				if(p==10){
					p=0;
				}
				System.out.print(p+" ");
				p++;
			}
			p--;
			for(int j=1;j<=i-1;j++){
				if(p==-1){
					p=9;
				}
				System.out.print(((p-1==-1)?9:p-1)+" ");
				p--;
			}
		}
	}
	public static void main(String... s){
		Pattern14 p=new Pattern14();
		p.input();
		p.print();
	}
}
