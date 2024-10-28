import java.util.stream.*;
import java.util.*;

public class StreamFilterMethod{
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
		names.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
	}
}
