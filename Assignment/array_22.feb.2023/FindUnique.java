import java.util.Arrays;
import java.util.Scanner;

public class FindUnique{
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();

		Arrays.sort(a);

		System.out.println("Uniques are: ");
		for(int i=0; i<a.length; i++){
			boolean unique = true;
			for(int j=i+1; j<a.length; j++){
				if(a[i] == a[j]){
					i = j;
					unique = false;
					break;
				}
			}
			if(unique){
				System.out.print(" "+a[i]);
			}
		}
	}
}
