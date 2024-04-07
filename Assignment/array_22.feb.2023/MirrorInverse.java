 class MirrorInverse{
	int n;
	int arr[];

	void input(){
		System.out.print("Enter the size of array: ");
		n=new java.util.Scanner(System.in).nextInt();
		arr=new int[n];

		for(int i=0;i<arr.length;i++){
			System.out.print("Enter "+(i+1)+" element in array: ");
			arr[i]=new java.util.Scanner(System.in).nextInt();
		}
	}
	void findInverse(){
		int arr1[]=new int[n];

		// swap the indexes with thier values
		for(int i=0;i<n;i++){
			arr1[arr[i]]=i;
		}

		// check both array is equal or not
		for(int i=0;i<n;i++){
			if(arr[i]==arr1[i]){
				if(i==n-1){
					System.out.print("Array is mirror inverse");
				}
				continue;
			}
			else{
				System.out.println("Array is not mirror inverse");
				break;
			}

		}
	}
	public static void main(String... s){
		MirrorInverse m=new MirrorInverse();
		m.input();
		m.findInverse();
	}
}
