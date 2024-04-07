class TriangleBMax{
	void triangleBmax(int x[][]){
		int m=x[0][0];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<=i;j++){
				if(m<x[i][j]){
					m=x[i][j];
				}
			}
		}
		System.out.println("Max of triangle B is "+m);
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		System.out.println("Matrix is:");
		Array.print2D(a);
		TriangleBMax t=new TriangleBMax();
		t.triangleBmax(a);
	}
}
