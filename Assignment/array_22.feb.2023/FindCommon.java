import java.util.Scanner;
import java.util.Arrays;

public class FindCommon{

	public static boolean find(int a[], int key){
		for(int i=0; i<a.length; i++){
			if(key == a[i]){
				return true;
			}
			if(key < a[i]){
				return false;
			}
		}
		return false;
	}
	public static void main(String args[]){
		System.out.println("First array: ");
		int a[] = MyArrayHelper.input();
		System.out.println("Second array: ");
		int b[] = MyArrayHelper.input();
		System.out.println("Third array: ");
		int c[] = MyArrayHelper.input();

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		System.out.println("Command element");
		for(int i=0; i<a.length; i++){
			if(find(b,a[i]) && find(c,a[i])){
				System.out.print(" "+a[i]);
			}
		}
	}
}
