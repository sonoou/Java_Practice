class Pattern27{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		for(int i=0;i<n;i++){
			System.out.println("\033[1;38;5;"+(i+1)+"m");
			//System.out.print("ol "+i);
			for(int j=i;j>=0;j--){
				System.out.print(" ");
				//System.out.print("s");
			}
			for(int j=i+1;j<=n;j++){
				if(i==0){
					System.out.print((char)(64+j)+" ");
				}
				else if(j==i+1 || j==n-i){
					System.out.print((char)(64+j)+" ");
				}
				else{
					//System.out.print(" ");
					for(int k=1;k<=(n-i)/2;k++){
						System.out.print("  ");
					}
				}
			}
		}
	}
	public static void main(String... s){
		Pattern27 p=new Pattern27();
		p.input();
		p.print();
	}
}
