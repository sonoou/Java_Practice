class Pattern13{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=1;j<=i;j++){
				System.out.print(" "+j);
				//if(i==n && j==n-1){
				//	j++;
				//	System.out.print(" ");
				//}
			}
			for(int j=i;j<=n*2-i-2;j++){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				if(i==n && j==i){
					j--;
				}
				System.out.print(" "+j);
			}
		}
	}
	public static void main(String... s){
		Pattern13 p=new Pattern13();
		p.input();
		p.print();
	}
}
