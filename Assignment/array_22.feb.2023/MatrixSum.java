class MatrixSum{
	void matrixsum(int x[][]){
		int sum;
		for(int i=0;i<x.length;i++){
			sum=0;
			System.out.print("\n  ");
			for(int j=0;j<x[i].length;j++){
				System.out.print("  "+x[i][j]);
				sum+=x[i][j];
			}
			System.out.print("  "+sum);
		}
		System.out.println();
		sum=0;
		for(int i=0;i<x.length;i++){
			sum+=x[i][x.length-1-i];
		}
		System.out.print(" "+sum);
		for(int i=0;i<x.length;i++){
			sum=0;
			for(int j=0;j<x[i].length;j++){
				sum+=x[j][i];
			}
			System.out.print(" "+sum);
		}
		sum=0;
		for(int i=0;i<x.length;i++){
			sum+=x[i][i];
		}
		System.out.print(" "+sum);
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		MatrixSum m=new MatrixSum();
		m.matrixsum(a);
	}
}
