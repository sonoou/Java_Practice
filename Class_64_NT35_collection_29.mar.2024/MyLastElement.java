import java.util.LinkedList;

public class MyLastElement{
	public static void main(String args[]){
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Last Element: "+arrl.getLast());
		System.out.println("Last Element: "+arrl.peekLast());
		System.out.println("List Element: "+arrl);
	}
}
//getLast(); returns the last element in this list but if list is
//empty then it returns exception.
//peekLast(); Retrieves the last element in the list, but if the
//list is empty then return null
