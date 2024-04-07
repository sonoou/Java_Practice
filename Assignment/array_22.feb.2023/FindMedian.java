class FindMedian{
	float findMedian(int z[]){
		for(int i=0;i<z.length-1;i++){
			for(int j=0;j<z.length-1-i;j++){
				if(z[j]>z[j+1]){
					int temp=z[j];
					z[j]=z[j+1];
					z[j+1]=temp;
				}
			}
		}
		System.out.print("\nSorted array");
		Array.print(z);
		if(z.length%2==0){
			float med=(float)(z[z.length/2-1]+z[z.length/2])/2;
			return med;
		}
		else{
			return z[z.length/2];
		}
	}
	public static void main(String... s){
		int a[]=Array.input();
		System.out.print("\nInput array");
		Array.print(a);
		FindMedian f=new FindMedian();
		System.out.println("\nMedian is "+f.findMedian(a));
	}
}
