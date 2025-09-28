class Sort{
	void sort(int x[]){
		for(int i=0;i<x.length-1;i++){
			for(int j=0;j<x.length-i-1;j++){
				if(x[j]>x[j+1]){
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		Array.print(x);
	}
	public static void main(String... s){
		int arr[]=Array.input();

		Sort st=new Sort();
		st.sort(arr);
	}
}
