import java.util.stream.*;
import java.util.*;

public class BoxedStream{
	public static void main(String args[]){
		List<Integer> ints = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
		System.out.println(ints);
		Optional<Integer> max = IntStream.of(1,2,3,4,5).boxed().max(Integer::compareTo);
		System.out.println(max);
	}
}
