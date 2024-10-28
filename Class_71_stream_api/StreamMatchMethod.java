//Various matchin operations can be used to check whether a given
//predicate matches the stream elements. All of these matching opertions
//are terminal and return a boolean result.
import java.util.stream.*;
import java.util.*;

public class StreamMatchMethod{
	public static void main(String args[]){
		List<String> names = new ArrayList<>();
		names.add("Amitabh");
		names.add("Shekhar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Shahrukh");
		names.add("Salman");
		names.add("Yana");
		names.add("Lokesh");
		boolean matchedResult = names.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);
		matchedResult = names.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);
		matchedResult = names.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);
	}
}
