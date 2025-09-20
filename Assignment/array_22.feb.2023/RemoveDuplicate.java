public class RemoveDuplicate{
	public static int remove(int arr[]){
		int temp[] = new int[arr.length];
		int ind = 0;
		temp[ind] = arr[ind];
		boolean dupflag = false;
		for(int i = 1; i<arr.length; i++){
			dupflag = false;
			for(int j = 0 ; j<=ind ; j++){
				if(temp[j] == arr[i]){
					dupflag = true;
					break;
				}
			}
			if(!dupflag){
				temp[++ind] = arr[i];
			}
		}
		System.out.print("Array is now ");
		MyArrayHelper.print(temp,ind+1);
		return ind+1;
	}
	public static void main(String args[]){
		int arr[] = MyArrayHelper.input();
		System.out.println("Lengh = "+remove(arr));
	}
}
