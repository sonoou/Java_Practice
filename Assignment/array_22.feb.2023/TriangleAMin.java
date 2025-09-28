class TriangleAMin{
	void triangleAmin(int x[][]){
		int m=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=i;j<x[i].length;j++){
				if(m>x[i][j]){
					m=x[i][j];
				}
			}
		}
		System.out.println("Min of triangle A is "+m);
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		System.out.println("Matrix is:");
		Array.print2D(a);
		TriangleAMin t=new TriangleAMin();
		t.triangleAmin(a);
	}
}
