import java.util.*;

class TreeSetDemo2{
	public static void main(String args[]){
		TreeSet<String> al = new TreeSet<String>();
		System.out.println(al.size());
		al.add("ccc");
		al.add("bbbbbb");
		al.add("aaaaa");
		al.add("ddddd");
		Iterator i = al.iterator();
		while(i.hasNext()){
			String e = (String)i.next();
			System.out.println(e);
		}
	}
}
