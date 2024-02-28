class MatrixMult{
	void matrixmult(int x[][],int y[][]){
		System.out.println("Matrix A\tMatrix B");
		Array.print2DSameLine(x,y);
		System.out.println("Multiply of Matrix A and B");
		int c[][]=new int[3][3];
		for(int i=0;i<c.length;i++){
			System.out.println();
			for(int j=0;j<c[i].length;j++){
				for(int k=0;k<x[i].length;k++){
					c[i][j]+=(x[i][k]*y[k][j]);
				}
				System.out.print(((c[i][j]>99)?" ":"  ")+c[i][j]);
			}
		}
	}
	public static void main(String... s){
		System.out.println("Matrix A:");
		int a[][]=Array.inputMatrix();
		System.out.println("Matrix B:");
		int b[][]=Array.inputMatrix();

		MatrixMult m=new MatrixMult();
		m.matrixmult(a,b);
	}
}
