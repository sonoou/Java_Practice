class Sort1{
	void sort1(int x[][]){
		int in=0;
		int a[],totalsize=0;

		for(int i=0;i<x.length;i++){
			totalsize+=x[i].length;
		}
		a=new int[totalsize];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				a[in]=x[i][j];
				in++;
			}
		}
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		Array.print(a);
	}
	public static void main(String... s){
		int arr[][]=Array.input2D();

		Sort1 st=new Sort1();
		st.sort1(arr);
	}
}
