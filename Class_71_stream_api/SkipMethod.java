//In this java program, we are using the skip() method to skip first 5
//even numbers from an infinite stream of even numbers and then collecting
//the next 10  even numbers into a new Stream.
import java.util.stream.*;
import java.util.*;

public class SkipMethod{
	public static void main(String args[]){
		Stream<Integer> evenNumInfiniteStream = Stream.iterate(0,n -> n + 2);
		List<Integer> newList = evenNumInfiniteStream.skip(5).limit(10)
                                                     .collect(Collectors.toList());
		System.out.println(newList);
	}
}
