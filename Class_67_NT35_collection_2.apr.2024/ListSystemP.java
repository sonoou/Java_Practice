import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class ListSystemP{
	public static void main(String args[]){
		String s = System.getProperty("java.class.path");
		System.out.println(s);
		System.setProperty("java.class.path","/home/sonu/Desktop");
		s = System.getProperty("java.class.path");
		System.out.println(s);
		Properties systemProperties = System.getProperties();
		SortedMap sortedSystemProperties = new TreeMap(systemProperties);
		Set keySet = sortedSystemProperties.keySet();
		Iterator iterator = keySet.iterator();
		while(iterator.hasNext()){
			String propertyName = (String)iterator.next();
			String propertyValue = systemProperties.getProperty(propertyName);
			System.out.println(propertyName+" = "+propertyValue);
		}
	}
}
