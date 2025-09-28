import java.util.Arrays;

public class ArraySort1{
	public static void main(String args[]){
		Emp[] e = new Emp[]{new Emp(10), new Emp(5), new Emp(12), new Emp(1)};
		Arrays.sort(e);

		for(int i = 0;i < e.length; i++){
			System.out.println(e[i].id);
		}
		Emp e1 = new Emp(5);
		int p = Arrays.binarySearch(e,e1);
		System.out.println("Position of 5 = "+p);
	}
}

class Emp implements Comparable<Emp>{
	int id;
	Emp(int id){
		this.id = id;
	}
	@Override
	public int compareTo(Emp e){
		if(this.id > e.id){
			return 1;
		}
		else if(this.id < e.id){
			return -1;
		}
		else{
			return 0;
		}
	}
}
