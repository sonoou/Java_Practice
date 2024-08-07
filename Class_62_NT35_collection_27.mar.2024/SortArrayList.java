import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList{
	public static void main(String args[]){
		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("USA");
		listofcountries.add("China");
		listofcountries.add("Denmark");
		listofcountries.add("China");
		/*Unsorted List*/
		System.out.println("Before Sorting");
		for(String counter:listofcountries){
			System.out.println(counter);
		}
		//Sort statement
		Collections.sort(listofcountries);
		//Sorted List
		System.out.println("After Sorting");
		for(String counter:listofcountries){
			System.out.println(counter);
		}
	}
}
