class TriangleASum{
	void triangleAsum(int x[][]){
		int sum=0;
		for(int i=0;i<x.length;i++){
			for(int j=i;j<x[i].length;j++){
				sum+=x[i][j];
			}
		}
		System.out.println("Sum of triangle A is "+sum);
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		System.out.println("Matrix is:");
		Array.print2D(a);
		TriangleASum t=new TriangleASum();
		t.triangleAsum(a);
	}
}
