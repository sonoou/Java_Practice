import java.util.ArrayList;
import java.util.List;

public class SubListExample{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
		// Addition of elements in ArrayList
		al.add("amit");
		al.add("sachin");
		al.add("Dhoni");
		al.add("rayana");
		al.add("virat");
		al.add("yuvraj");

		System.out.println("Original ArrayList Content: "+al);
		//Sublist to ArrayList
		ArrayList<String> al2 = new ArrayList<String>(al.subList(1,4));
		System.out.println("SubList stored in ArrayList: "+al2);
		//Sublist to List
		List<String> list = al.subList(1,4);
		System.out.println("SubList stored in List: "+list);
	}
}
