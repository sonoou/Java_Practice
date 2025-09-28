class Trim1{
	public static void main(String args[]){
		String Str = new String("     Welcome to Tutorials of String    ");
		System.out.println(Str);
		System.out.println("before trim "+Str.length());
		System.out.println("Return Value: ");
		String z=Str.trim();
		System.out.println(z);
		System.out.println("after trim "+z.length());
	}
}
