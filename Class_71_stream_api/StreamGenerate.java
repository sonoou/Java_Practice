import java.util.stream.*;
import java.util.*;

public class StreamGenerate{
	public static void main(String[] args){
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);
	}
}
