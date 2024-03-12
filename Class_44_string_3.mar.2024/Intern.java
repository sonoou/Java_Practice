public class Intern{
	public static void main(String... s){
		String Str1=new String("Welcome to Tutorials");
		String Str2=new String("WELCOME TO TUTORIALS OF STRING");

		System.out.print("Canonical represtention:");
		System.out.println(Str1.intern());

		System.out.print("Canonical representation:");
		System.out.println(Str2.intern());
	}
}
