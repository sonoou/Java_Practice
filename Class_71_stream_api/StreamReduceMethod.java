//The reduce() method performs a reduction on the elements of the stream
//with the given function. The result is an Option holding the reduced
//value. In the given example, we are reducing all the strings by 
//concatenating them using a separator #.

import java.util.stream.*;
import java.util.*;

public class StreamReduceMethod{
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
		Optional<String> reduced = names.stream().reduce((s1,s2) -> s1+"#"+s2);
		reduced.ifPresent(System.out::println);
	}
}
