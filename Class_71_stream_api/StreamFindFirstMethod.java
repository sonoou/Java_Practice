//The findFirst() method will return the first element from the stream
//and then it will not process any more elements
import java.util.stream.*;
import java.util.*;

public class StreamFindFirstMethod{
	public static void main(String args[]){
		List<String> names = new ArrayList<>();
		names.add("Amitabh");
		names.add("Shekhar");
		names.add("Aman");
		names.add("Lalu");
		names.add("LaluRabari");
		names.add("Salman");
		names.add("Yana");
		names.add("Lokesh");
		String firstMatchedName = names.stream().filter((s) -> s.startsWith("L"))
                                       .findFirst()
                                       .get();
		System.out.println(firstMatchedName);
	}
}
