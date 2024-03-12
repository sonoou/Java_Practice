public class StartsWith{
	public static void main(String args[]){
		String Str=new String("Welcome to Tutorials fo String");

		System.out.print("Return Value: ");
		System.out.println(Str.startsWith("Welcome"));

		System.out.print("Return Value: ");
		System.out.println(Str.startsWith("Tutorials"));

		System.out.print("Return value: ");
		System.out.println(Str.startsWith("Tutorials",11));
	}
}
