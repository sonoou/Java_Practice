public class TypeCastingExample
{
	void show(long a){
		System.out.println(a);
	}
	public static void main(String args[])
	{
		int x = 10;
		TypeCastingExample t = new TypeCastingExample();
		t.show(x);
		char ch = 'A';
		int i = ch;
		System.out.println(i);
	}
}
