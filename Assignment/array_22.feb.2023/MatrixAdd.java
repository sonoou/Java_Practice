class MatrixAdd{
	void matrixadd(int x[][],int y[][]){
		System.out.println("Matrix A\tMatrix B");
		Array.print2DSameLine(x,y);
		System.out.println("Sum of Matrix A and B");
		for(int i=0;i<x.length;i++){
			System.out.println();
			for(int j=0;j<x[i].length;j++){
				System.out.print(" "+(x[i][j]+y[i][j]));
			}
		}
	}
	public static void main(String... s){
		System.out.println("Matrix A:");
		int a[][]=Array.inputMatrix();
		System.out.println("Matrix B:");
		int b[][]=Array.inputMatrix();

		MatrixAdd m=new MatrixAdd();
		m.matrixadd(a,b);
	}
}
