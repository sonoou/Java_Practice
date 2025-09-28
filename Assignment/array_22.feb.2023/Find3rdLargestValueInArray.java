class Find3rdLargestValueInArray{
	void find3rdlargestvalueinarray(int z[]){
		int first,second,third;

		first=0;
		for(int i=0;i<z.length;i++){
			if(first<z[i]){
				first=z[i];
			}
		}

		second=0;
		for(int i=0;i<z.length;i++){
			if(first>z[i] && second<z[i]){
				second=z[i];
			}
		}

		third=0;
		for(int i=0;i<z.length;i++){
			if(second>z[i] && first>z[i] && third<z[i]){
				third=z[i];
			}
		}
		//System.out.println("First Largest: "+first);
		//System.out.println("Second Largest: "+second);
		System.out.println("Third Largest: "+third);
	}
	public static void main(String... s){
		int a[]=Array.input();
		System.out.println("Input array");
		Array.print(a);
		Find3rdLargestValueInArray f=new Find3rdLargestValueInArray();
		f.find3rdlargestvalueinarray(a);
	}
}
