class Emp{
	static String cname="tcs";
	String name;
	int salary;

	void get(String s1,int s2){
		name=s1;
		salary=s2;
	}
	void show(){
		System.out.println(name);
		System.out.println(salary);
		System.out.println(cname);
	}
	static int add(int a,int b){
		return a+b;
	}
	public static void main(String s[]){
		Emp e1=new Emp();
		e1.get("lalu",101);
		e1.show();

		System.out.println(cname);
		System.out.println(Emp.cname);

		int z=Emp.add(10,20);
		System.out.println(z);

		z=add(10,200);
		System.out.println(z);
	}
}

class Demo{
	public static void main(String s[]){
		Emp e2=new Emp();
		e2.get("rabari",51);
		e2.show();
		int z=Emp.add(10,30);
		System.out.println(z);
		System.out.println(Emp.cname);
	}
}