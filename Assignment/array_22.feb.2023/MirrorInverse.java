 class MirrorInverse{
	int n;
	int arr[];

	void input(){
		System.out.print("Enter the size of array: ");
		n = new java.util.Scanner(System.in).nextInt();
		arr = new int[n];

		for(int i=0; i < arr.length; i++){
			System.out.print("Enter "+(i+1)+" element in array: ");
			arr[i] = new java.util.Scanner(System.in).nextInt();
		}
	}
	void findInverse(){
		boolean myflag = true;

		// swap the indexes with thier values
		for(int i = 0; i < arr.length; i++){
			if(arr[arr[i]] == i){
				continue;
			}
			else{
				myflag = false;
				break;
			}
		}

		if(myflag){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public static void main(String... s){
		MirrorInverse m = new MirrorInverse();
		m.input();
		m.findInverse();
	}
}
