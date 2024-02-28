class Max{
	int max(int x[]){
		int m=x[0];
		for(int i=0;i<x.length;i++){
			if(m<x[i]){
				m=x[i];
			}
		}
		return m;
	}
	public static void main(String... s){
		int a[]=Array.input();
		Max m=new Max();
		System.out.println("Max is "+m.max(a));
	}
}
