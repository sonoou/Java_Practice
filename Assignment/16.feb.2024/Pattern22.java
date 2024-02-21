class Pattern22{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=0;i<n;i++){
			System.out.println("\033[1;38;5;"+(i+1)+"m");
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--){
				System.out.print(j);
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
		}
	}
	public static void main(String... s){
		Pattern22 p=new Pattern22();
		p.input();
		p.print();
	}
}
