import java.util.IdentityHashMap;
import java.util.HashMap;

class IdentityHashMapEx{
	public static void main(String args[]){
		IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();
		HashMap<String, String> Map1 = new HashMap<String, String>();
		identityMap.put("sony","bravia");
		identityMap.put(new String("sony"),"mobile");
		Map1.put("sony","bravia");
		Map1.put(new String("sony"),"mobile");
		//size of identityMap should be 2 here because two strings are different objects
		System.out.println("Size of IdentityHashMap: "+identityMap.size());
		System.out.println("Size of HashMap: "+Map1.size());
		System.out.println("IdentityHashMap: "+identityMap);
		System.out.println("HashMap: "+Map1);

		identityMap.put("sony","videogame");
		//size of identityMap still should be 2 because "sony" and "sony" is same object
		System.out.println("Size of IdentityHashMap: "+identityMap.size());
		System.out.println("IdentityHashMap: "+identityMap);
	}
}

