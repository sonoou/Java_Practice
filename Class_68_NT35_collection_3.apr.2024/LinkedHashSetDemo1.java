import java.util.*;

class LinkedHashSetDemo1{
	public static void main(String args[]){
		LinkedHashSet<Emp> al = new LinkedHashSet<Emp>();
		System.out.println(al.size());
		al.add(new Emp(1002));
		al.add(new Emp(1003));
		al.add(new Emp(1004));
		al.add(new Emp(1005));
		System.out.println(al.size());
		Iterator<Emp> i = al.iterator();
		while(i.hasNext()){
			Emp e = i.next();
			System.out.println(e.id);
		}
	}
}
