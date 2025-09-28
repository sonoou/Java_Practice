class FindMean{
	float findmean(int z[]){
		float sum=0;
		for(int i=0;i<z.length;i++){
			sum+=z[i];
		}
		float result=sum/z.length;
		return result;
	}
	public static void main(String... s){
		int a[]=Array.input();
		System.out.print("\nInput array");
		Array.print(a);
		FindMean f=new FindMean();
		System.out.print("\nMean is "+f.findmean(a));
	}
}
