class Pattern41{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=1;i<=n;i++){
			System.out.println("\033[1;38;5;"+i+"m");
			for(int j=1;j<=n;j++){
				if(i==1){
					System.out.print(j+" ");
				}
				else if(j==1){
					System.out.print(i+" ");
				}
				else if(j==n){
					System.out.print((j-i+1)+" ");
				}
				else if(i==n){
					System.out.print((i-j+1)+" ");
				}
				else{
					System.out.print("  ");
				}
			}
		}
	}
	public static void main(String... s){
		Pattern41 p=new Pattern41();
		p.input();
		p.print();
	}
}
