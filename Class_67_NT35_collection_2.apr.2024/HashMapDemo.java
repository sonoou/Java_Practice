import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

class HashMapDemo{
	public static void main(String args[]){
		HashMap<String, String> hm = new HashMap<>();
		System.out.println(hm.size());
		hm.put("1001","aaaa");
		hm.put("1002","bbbb");
		hm.put("1003","cccc");
		hm.put("1004","dddd");
		hm.put(new String("1001"),"zzz");
		Set s = hm.entrySet();
		Iterator<Map.Entry> i = s.iterator();
		while(i.hasNext()){
			Map.Entry e = i.next();
			String k = (String)e.getKey();
			String v = (String)e.getValue();
			System.out.println(k+" = "+v);
		}
	}
}
