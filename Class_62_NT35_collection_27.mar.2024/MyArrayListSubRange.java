import java.util.ArrayList;
import java.util.List;

public class MyArrayListSubRange{
	public static void main(String args[]){
		ArrayList<String> arrl = new ArrayList<String>();
		//adding elements to the end
		arrl.add("0First");
		arrl.add("1Second");
		arrl.add("2Third");
		arrl.add("3Random");
		arrl.add("4Click");
		System.out.println("Actual ArrayList: "+arrl);
		List<String> list = arrl.subList(2,4); //index 4th element will not be included
		System.out.println("Sub List: "+list);
	}
}
