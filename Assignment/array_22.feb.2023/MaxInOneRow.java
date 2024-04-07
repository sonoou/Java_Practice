class MaxInOneRow{
	void maxinonerow(int x[][]){
		int y[]=new int[x.length],max=0;

		for(int i=0;i<x.length;i++){
			max=0;
			for(int j=0;j<x[i].length;j++){
				if(x[i][j]==1){
					max++;
				}
			}
			y[i]=max;
		}

		max=y[0];
		for(int i=0;i<y.length;i++){
			if(max<y[i]){
				max=y[i];
			}
		}
		System.out.println("Input Matrix");
		Array.print2D(x);
		for(int i=0;i<y.length;i++){
			if(max==y[i]){
				System.out.println("Max in one row: "+(i+1));
			}
		}
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		MaxInOneRow m=new MaxInOneRow();
		m.maxinonerow(a);
	}
}
