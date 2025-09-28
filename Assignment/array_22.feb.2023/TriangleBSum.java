class TriangleBSum{
	void triangleBsum(int x[][]){
		int sum=0;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<=i;j++){
				sum+=x[i][j];
			}
		}
		System.out.println("Sum of triangle B is "+sum);
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		System.out.println("Matrix is:");
		Array.print2D(a);
		TriangleBSum t=new TriangleBSum();
		t.triangleBsum(a);
	}
}
