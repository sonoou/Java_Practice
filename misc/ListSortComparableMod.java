import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortComparable{
	public static void main(String arsg[]){
		ArrayList<Empl> list = new ArrayList<Empl>();
		list.add(new Empl("Ram", 3000));
		list.add(new Empl("John",6000));
		list.add(new Empl("Aoish",2000));
		list.add(new Empl("Tom",2400));
		list.add(new Empl("Aom",2000));
		Collections.sort(list);
		System.out.println("Sorted list entries: ");
		for(Empl e:list){
			System.out.println(e.getSalary()+" = "+e.name);
		}
	}
}

class Empl implements Comparable<Empl>{
	String name;
	int salary;
	Empl(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	int getSalary(){
		return salary;
	}
	public int compareTo(Empl e){
		System.out.println("sort");
		if(this.salary > e.salary){
			return -1;
		}
		else if(this.salary<e.salary){
			return 1;
		}
		else{
			int i = this.name.compareTo(e.name);
			if(i<0){
				return -1;
			}
			else if(i>0){
				return 1;
			}
			else{
				return 0;
			}
		}
	}
}
