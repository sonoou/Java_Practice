public class SubArraySumZero{
	public static void find(int arr[]){
		int first = 0,last = 0;
		System.out.print("There is a sub array with zero sum from index ");
		for(int i=0; i<arr.length; i++){
			first = i;
			int sum = 0;
			for(int j=i; j<arr.length; j++){
				sum = sum + arr[j];
				if(sum == 0){
					last = j;
					break;
				}
			}
			if(sum == 0){
				System.out.println(first+" to "+last);
				break;
			}
		}
	}
	public static void main(String args[]){
		int arr[] = MyArrayHelper.input();
		find(arr);
	}
}
