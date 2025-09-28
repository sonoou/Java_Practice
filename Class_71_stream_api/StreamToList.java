// The collect() method is used to receive elements from a stream and store
// them in a collection.
import java.util.stream.*;
import java.util.*;

public class StreamToList{
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
		List<String> memNamesInUppercase = names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
	}
}
