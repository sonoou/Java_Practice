import java.util.stream.*;
import java.util.*;

public class StreamOfString{
	public static void main(String[] args){
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p -> System.out.println(p));

		Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
		stream1.forEach(p -> System.out.println(p));
	}
}
