import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Integer;

public class RemoveDuplicatesHashSet{
	public static void main(String args[]){
		ArrayList<Integer> duplist = new ArrayList<Integer>();
		System.out.print("Enter array size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=0; i<size; i++){
			System.out.print("Enter "+(i+1)+" element: ");
			int value = sc.nextInt();
			duplist.add(value);
		}

		HashSet<Integer> removed = new HashSet<Integer>(duplist);
		System.out.println("Dup remvd");
		System.out.println(removed);
	}
}
