import java.util.HashMap;

public class MyHashMapClear{
	public static void main(String args[]){
		HashMap<String, String> hm = new HashMap<String, String>();
		//add key-value pair to hashmap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println("My HashMap content:");
		System.out.println(hm);
		hm.clear();
		System.out.println("Content After clear: ");
		System.out.println(hm);
	}
}
