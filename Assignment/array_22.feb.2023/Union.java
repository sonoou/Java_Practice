class Union{
	void union(int x[], int y[]){
		boolean non_repeating;
		for(int i=0;i<x.length;i++){
			non_repeating=true;
			for(int j=0;j<y.length;j++){
				if(x[i]==y[j]){
					non_repeating=false;
					System.out.print(" "+x[i]);
					y[j]=0;
				}
				if(non_repeating==true && j==y.length-1){
					System.out.print(" "+x[i]);
				}
			}
		}
		for(int i=0;i<y.length;i++){
			if(y[i]!=0){
				System.out.print(" "+y[i]);
			}
		}
	}
	public static void main(String... s){
		System.out.println("First array");
		int a[]=Array.input();
		System.out.println("Second array");
		int b[]=Array.input();

		Union u=new Union();
		u.union(a,b);
	}
}
