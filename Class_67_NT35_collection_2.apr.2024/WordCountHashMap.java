import java.util.HashMap;
import java.util.Map;

public class WordCountHashMap{
	public static void main(String args[]){
		String s = "this  is a  test       this is a test lalu";
		String splitted[] = s.split(" ");
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i<splitted.length; i++){
			if(hm.containsKey(splitted[i])){
				int cont = hm.get(splitted[i]);
				hm.put(splitted[i], cont + 1);
			}
			else{
				hm.put(splitted[i],1);
			}
		}
//		hm.remove("");
		System.out.println(hm);
	}
}
