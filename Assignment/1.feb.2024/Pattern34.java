class Pattern34{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=i;j++){
				if(j%2==0 || i==1){
					System.out.print(1);
				}
				else{
					System.out.print(0);
				}
			}
		}
	}
	public static void main(String... s){
		Pattern34 p=new Pattern34();
		p.input();
		p.print();
	}
}
