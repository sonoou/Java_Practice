class CountPNZ{
	int n;

	void input(){
		System.out.print("How many numbers you have: ");
		n=new java.util.Scanner(System.in).nextInt();
	}
	void count(){
		int p=0;
		int n=0;
		int z=0;
		int x;
		for(int i=1;i<=this.n;i++){
			System.out.print("Enter the "+i+" value: ");
			x=new java.util.Scanner(System.in).nextInt();
			if(x==0){
				z++;
			}
			else if(x>0){
				p++;
			}
			else{
				n++;
			}
		}
		System.out.println("Total number of positive no: "+p);
		System.out.println("Total number of negative no: "+n);
		System.out.println("Total number of zero no: "+z);
	}
	public static void main(String... s){
		CountPNZ c=new CountPNZ();
		c.input();
		c.count();
	}
}
