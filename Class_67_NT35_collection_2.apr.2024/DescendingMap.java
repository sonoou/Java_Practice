import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class DescendingMap{
	public static void main(String[] args){
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2,"two");
		map.put(1,"one");
		map.put(3,"three");
		System.out.println("Original map: "+map+"\n");
		NavigableMap reverse = map.descendingMap();
		System.out.println("Descending map: "+reverse+"\n");
	}
}
