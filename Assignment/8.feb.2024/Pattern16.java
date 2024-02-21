class Pattern16{
	int n;

	void input(){
		System.out.print("Enter a number: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void print(){
		int a=0;
		int p[][]=new int[2][n],temp=0;
		for(int i=0;i<n;i++){
			System.out.println("\033[1;38;5;"+i+"m\n");
			for(int j=0;j<=i;j++){
				if(j==0){
					System.out.print(1+"  ");
					//p[a][j]=1;
					//if(a==1 || ){
						p[1][j]=1;
					//}
					//else{
						p[0][j]=1;
					//}
				}
				else{
					if(a==0){
						System.out.print((p[0][j-1]+p[0][j])+(((p[0][j-1]+p[0][j]<=9)?"  ":" ")));
						p[1][j]=p[0][j-1]+p[0][j];
					}
					else{
						System.out.print((p[1][j-1]+p[1][j])+(((p[1][j-1]+p[1][j]<=9)?"  ":" ")));
						p[0][j]=p[0][j-1]+p[0][j];
					}
					if(j==i){
						p[1][j]=1;
						p[0][j]=1;
					}
				}
			}
			if(a==0 && i>2){
				a=1;
			}
			else{
				a=0;
			}
		}
	}
	public static void main(String... s){
		Pattern16 p=new Pattern16();
		p.input();
		p.print();
	}
}
