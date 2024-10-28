import java.util.HashSet;

public class MyHashSetToArray{
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		//add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println("HashSet content: ");
		System.out.println(hs);
		String[] strArr = new String[hs.size()];
		hs.toArray(strArr);
		for(String str:strArr){
			System.out.println(str);
		}
	}
}
