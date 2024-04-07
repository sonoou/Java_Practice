class PrintDigonalWise{
	void printdigonalwise(int x[][]){
		System.out.println("Input Matrix");
		Array.print2D(x);

		System.out.println("Digonal wise");
		for(int i=0;i<x.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(" "+x[j][i-j]);
				//System.out.print(" "+j);
				//System.out.print(i-j);
			}
			System.out.println();
		}
		for(int i=1;i<x.length;i++){
			for(int j=1;j<=x.length-i;j++){
				System.out.print(" "+x[i+j-1][x.length-j]);
				//System.out.print(" "+(i+j-1));
				//System.out.print(x.length-j);
			}
			System.out.println();
		}
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		PrintDigonalWise p=new PrintDigonalWise();
		p.printdigonalwise(a);
	}
}
