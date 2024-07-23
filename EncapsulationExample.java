//Java Encapsulation
//
//	Object         ----->       class
//	{
//		properties ----->  data member
//		behaviour  ----->  member function
//	}


class EncapsulationExample
{
	int x = 10;
	int y = 20;
	static int z = 30;

	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	static void show(){
		System.out.println(x);
	}
	public static void main(String args[])
	{
		Myclass m = new Myclass();
		m.display();
		show();
	}
}