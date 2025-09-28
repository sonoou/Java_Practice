public class RemoveAllOccurence{
	public static int remove(int arr[], int value){
		int temp[] = new int[arr.length];
		int ind = 0;

		for(int i=0; i<arr.length; i++){
			if(arr[i] != value){
				temp[ind] = arr[i];
				ind++;
			}
		}
		S

