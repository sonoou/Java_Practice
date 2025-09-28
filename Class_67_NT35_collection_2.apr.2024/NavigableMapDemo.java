// The pollFirstEntry() method returns and removes the "first entry(key +
// value) in the NavigableMap or null if the map is empty.
// The pollLastEntry() returns and removes the "last" element in the map
// or null if the map is empty. "First" means smallest element according
// to the sort order of the keys. "Last means largest key according to
// the element sorting order of the map
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class NavigableMapDemo{
	public static void main(String args[]){
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2,"two");
		map.put(1,"one");
		map.put(3,"three");
		System.out.println("Original map: "+map+"\n");

		Entry firstEntry = map.pollFirstEntry();
		System.out.println("Last entry: "+firstEntry);
		System.out.println("After polling last entry: "+map+"\n");

		Entry lastEntry = map.pollLastEntry();
		System.out.println("Last entry: "+lastEntry);
		System.out.println("After polling last entry: "+map);
	}
}
