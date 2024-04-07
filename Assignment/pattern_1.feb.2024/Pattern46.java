class Pattern46{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=i;j<=n;j++){
				System.out.print(i);
			}
		}
	}
	public static void main(String... s){
		Pattern46 p=new Pattern46();
		p.input();
		p.print();
	}
}
