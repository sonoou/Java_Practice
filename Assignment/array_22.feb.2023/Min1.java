class Min1{
	int min1(int x[][]){
		int m=x[0][0];

		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				if(m>x[i][j]){
					m=x[i][j];
				}
			}
		}
		return m;
	}
	public static void main(String... s){
		int a[][]=Array.input2D();
		Min1 m=new Min1();
		System.out.println("Min is "+m.min1(a));
	}
}
