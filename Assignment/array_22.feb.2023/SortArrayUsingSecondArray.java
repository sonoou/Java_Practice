public class SortArrayUsingSecondArray{
	public static void sort(char array1[], int array2[]){
		System.out.println("input array");
		MyArrayHelper.print(array1);
		MyArrayHelper.print(array2);

		for(int i=0; i<array2.length - 1; i++){
			for(int j=0; j<array2.length - i - 1; j++){
				if(array2[j] > array2[j+1]){
					int temp = array2[j];
					array2[j] = array2[j+1];
					array2[j+1] = temp;

					char tempc = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = tempc;
				}
			}
		}
		System.out.println("Output array: ");
		MyArrayHelper.print(array1);
		MyArrayHelper.print(array2);
	}
	public static void main(String args[]){
		System.out.print("Enter a string: ");
		String str = new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter int array: ");
		int a[] = MyArrayHelper.input();
		new SortArrayUsingSecondArray().sort(str.toCharArray(),a);
	}
}
