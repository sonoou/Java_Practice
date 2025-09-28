class Emp{
	String name;
	int salary;

	void get(String s1,int s2){
		 name=s1;
		 salary=s2;
	}
	void show(){
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String args[]){
		Emp e1=new Emp();
		e1.get("lalu",101);
		e1.show();

		e1.get("rabari",51);
		e1.show();
	}
}