class MatrixTranspose{
	void matrixtranspose(int x[][]){
		System.out.println("Before Transpose");
		Array.print2D(x);
		System.out.println("After Transpose");
		for(int i=0;i<x.length;i++){
			System.out.println();
			for(int j=0;j<x[i].length;j++){
				System.out.print(" "+x[j][i]);
			}
		}
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		MatrixTranspose m=new MatrixTranspose();
		m.matrixtranspose(a);
	}
}
