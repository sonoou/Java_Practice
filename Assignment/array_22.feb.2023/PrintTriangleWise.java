class PrintTriangleWise{
	void printTriangleWise(int x[][]){
		System.out.println("Triangle A");
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print((j>=i)?(" "+x[i][j]):"  ");
			}
			System.out.println();
		}

		System.out.println("Triangle B");
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print((j<=i)?(" "+x[i][j]):"  ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		int a[][]=Array.inputMatrix();
		System.out.println("Input Matrix");
		Array.print2D(a);
		PrintTriangleWise p = new PrintTriangleWise();
		p.printTriangleWise(a);
	}
}
