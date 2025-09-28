import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListSwap{
	public static void main(String args[]){
		ArrayList<String> list =  new ArrayList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		System.out.println(list);
		Collections.swap(list,2,5);
		System.out.println("Result after swap operation: ");
		for(String str:list){
			System.out.println(str);
		}
		Collections.swap(list,5,2);
		System.out.println("swap(5,2): "+list);
	}
}
