//With the  Fork/Join framework added in Java SE 7, we have efficient
//machinery for implementing parallel operations in our applications.
//To enable parallelism, all we have to do is to create a parallel stream,
//instead of a sequential stream. Anytime we want to do a particular job using multiple instead of stream() method.
import java.util.stream.*;
import java.util.*;

public class ParallelismStream{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<10; i++){
			list.add(i);
		}
		//Here creating a parallel stream
		Stream<Integer> stream = list.parallelStream();
		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		for(int z:evenNumbersArr){
			System.out.print(z);
		}
	}
}
