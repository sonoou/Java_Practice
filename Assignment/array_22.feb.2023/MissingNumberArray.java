import java.util.Arrays;

public class MissingNumberArray{
	public static void find(int a[]){
		System.out.println("Input array: ");
		MyArrayHelper.print(a);
		System.out.println("Missing numbers: ");

		Arrays.sort(a);
		int j = 0;
		int start = 1;
		for(int i=start; j<a.length && i<=a[j]; i++){
			if(i == a[j]){
				i = a[j++];
				start = i;
			}
			else{
				System.out.print(" "+i);
			}
		}

		for(int i = start+1; i<=100; i++){
			System.out.print(" "+i);
		}
	}
	public static void main(String args[]){
		int a[] =  MyArrayHelper.input();
		find(a);
	}
}
