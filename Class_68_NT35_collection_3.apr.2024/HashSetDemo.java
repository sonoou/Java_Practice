import java.util.*;

class HashSetDemo{
	public static void main(String argsg[]){
		HashSet<String> al = new HashSet<String>();
		System.out.println(al.size());
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al.add("c"));
		System.out.println(al.size());
		System.out.println(al);
	}
}
