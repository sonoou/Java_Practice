//The sorted() method is an intermediate operation that returns a sorted
//view of the stream. The elements in the stream are sorted in natural
//order unless we pass a custom Comparator.
import java.util.stream.*;
import java.util.*;

public class StreamSortedMethod{
	public static void main(String[] args){
		List<String> names = new ArrayList<>();
		names.add("Amitabh");
		names.add("Shekhar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Shahrukh");
		names.add("Salman");
		names.add("Yana");
		names.add("Lokesh");
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}
}
