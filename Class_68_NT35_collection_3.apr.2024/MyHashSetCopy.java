import java.util.HashSet;

public class MyHashSetCopy{
	public static void main(String a[]){
		HashSet<String> hs = new HashSet<String>();
		//add elements to HashSet
		hs.add("First");
		hs.add("Second");
		hs.add("third");
		System.out.println(hs);
		HashSet<String> subSet = new HashSet<String>();
		subSet.add("s1");
		subSet.add("s2");
		hs.addAll(subSet);
		System.out.println("HashSet content after adding another collection: ");
		System.out.println(hs);
	}
}
