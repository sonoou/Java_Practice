import java.util.*;

class ArrayListDemo{
	public static void main(String s[]){
		ArrayList<String> al = new ArrayList<String>();
		//ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		//al.add(10);
		System.out.println(al.size()); // print size fo array list
		al.remove(2); //remove element on that index
		System.out.println(al.size());
		System.out.println(al); // print array list
	}
}
