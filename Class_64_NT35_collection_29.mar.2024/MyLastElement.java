import java.util.LinkedList;

public class MyLastElement{
	public static void main(String a[]){
		LinkedList<String> arrl = new LinkedList<String>();
		/*arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random"); */

		//System.out.println("Last Element: "+arrl.getLast());
		System.out.println("Last Element: "+arrl.peekLast());
		System.out.println("List Element: "+arrl);
	}
}

// getLast(): return the last element in this list but if list is empty then it return exception
// peekLast(): Retrieves the last element in the list, but
// if the line is empty then return null.
