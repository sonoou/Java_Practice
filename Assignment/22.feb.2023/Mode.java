class Mode{
	float mode(int x[]){
		boolean nr=true;
		int yi=0;
		int y[]=new int[x.length];
		for(int i=0;i<x.length;i++){
			if(i==0){
				y[yi]=x[i];
				yi++;
			}
			else{
				for(int j=0;j<i;j++){
					if(y[j]==x[i] && nr==true){
						nr=false;
					}
				}
				if(nr==true){
					y[yi]=x[i];
					yi++;
				}
			}
			nr=true;
		}
		int z[]=new int[yi];
		int count=0;
		//System.out.println("Array element\tFrequency");
		for(int i=0;i<yi;i++){
			for(int j=0;j<x.length;j++){
				if(y[i]==x[j]){
					count++;
				}
			}
			z[i]=count;
			//System.out.println("\t"+y[i]+"\t"+count);
			count=0;
		}

		int max=z[0];
		for(int i=0;i<z.length;i++){
			if(max<z[i]){
				max=z[i];
			}
		}

		for(int i=0;i<y.length;i++){
			if(z[i]==max){
				//System.out.println("Mode is "+y[i]);
				return y[i];
			}
		}
		return 0.0f;
	}
	public static void main(String... s){
		int a[]=Array.input();
		Mode m=new Mode();
		System.out.println("Mode is "+m.mode(a));
	}
}
