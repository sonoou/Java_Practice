class SequenceDigonalWise{
	void sequencedigonalwise(int x[][]){
		System.out.println("Input Matrix");
		Array.print2D(x);

		System.out.println("Sequence Digonal wise");
		boolean s=false;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<=i;j++){
				if(s==true){
					System.out.print(" "+x[i-j][j]);
					//System.out.print(" "+(i-j));
					//System.out.print(j);
				}
				else{
					System.out.print(" "+x[j][i-j]);
					//System.out.print(" "+j);
					//System.out.print(i-j);
				}
			}
			s=(s==true)?false:true;
			System.out.println();
		}
		s=false;
		for(int i=1;i<x.length;i++){
			for(int j=1;j<=x.length-i;j++){
				if((s==true && x.length%2!=0) || (s==false && x.length%2==0)){
					System.out.print(" "+x[i+j-1][x.length-j]);
					//System.out.print(" "+(i+j-1));
					//System.out.print(x.length-j);
				}
				else{
					System.out.print(" "+x[x.length-j][i+j-1]);
					//System.out.print(" "+(x.length-j));
					//System.out.print(i+j-1);
				}
			}
			s=(s==true)?false:true;
			System.out.println();
		}
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		SequenceDigonalWise p=new SequenceDigonalWise();
		p.sequencedigonalwise(a);
	}
}
