class Reverse{
	int arr[]=Array.input();

	void reverse(){
		System.out.print("Input array: ");
		Array.print(arr);
		int b[]=new int[arr.length];
		int n = (arr.length%2==0)?(arr.length/2-1):(arr.length/2);
		for(int i=0;i<=n;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.print("Output Array: ");
		Array.print(arr);
	}

	public static void main(String... s){
		Reverse r=new Reverse();
		r.reverse();
	}
}
