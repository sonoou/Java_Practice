class FrequencyCount{
	void frequencycount(int x[]){
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

		int count=0;
		System.out.println("Array element\tFrequency");
		for(int i=0;i<yi;i++){
			for(int j=0;j<x.length;j++){
				if(y[i]==x[j]){
					count++;
				}
			}
			System.out.println("\t"+y[i]+"\t"+count);
			count=0;
		}
	}
	public static void main(String... s){
		int a[]=Array.input();
		FrequencyCount f=new FrequencyCount();
		f.frequencycount(a);
	}
}
