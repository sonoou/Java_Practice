class Min{
	int min(int x[]){
		int m=x[0];
		for(int i=0;i<x.length;i++){
			if(m>x[i]){
				m=x[i];
			}
		}
		return m;
	}
	public static void main(String... s){
		int a[]=Array.input();
		Min m=new Min();
		System.out.println("Min is "+m.min(a));
	}
}
