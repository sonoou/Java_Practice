import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListShuffle{
	public static void main(String args[]){
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		Collections.shuffle(list);
		System.out.println("Result after shuffle operation");
		for(String str:list){
			System.out.println(str);
		}

		Collections.shuffle(list);
		System.out.println("Result after shuffle operation:");
		for(String str:list){
			System.out.println(str);
		}
	}
}
