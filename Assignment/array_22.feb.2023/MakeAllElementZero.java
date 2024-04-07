class MakeAllElementZero{
	void makeallelementzero(int x[][]){
		int zeroCount=0;

		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				if(x[i][j]==0){
					zeroCount++;
				}
			}
		}

		int indI[]=new int[zeroCount];
		int indJ[]=new int[zeroCount];
		int k=0;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				if(x[i][j]==0){
					indI[k]=i;
					indJ[k]=j;
					k++;
				}
			}
		}

		for(int i=0;i<indI.length;i++){
			if(indI[i]-1>=0){
				x[ indI[i]-1 ][ indJ[i] ]=0;
			}
			if(indI[i]+1<x.length){
				x[ indI[i]+1 ][ indJ[i] ]=0;
			}
			if(indJ[i]-1>=0){
				x[ indI[i] ][ indJ[i]-1 ]=0;
			}
			if(indJ[i]+1<x[0].length){
				x[ indI[i] ][ indJ[i]+1 ]=0;
			}
		}
		System.out.print("After making zero");
		Array.print2D(x);
	}
	public static void main(String... s){
		int a[][]=Array.inputMatrix();
		System.out.println("Before making zero");
		Array.print2D(a);
		MakeAllElementZero m=new MakeAllElementZero();
		m.makeallelementzero(a);
	}
}
