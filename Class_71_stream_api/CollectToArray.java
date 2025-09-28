import java.util.stream.*;
import java.util.*;

public class CollectToArray{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<10; i++){
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		for(int z:evenNumbersArr){
			System.out.println(z);
		}
	}
}
