// var can be used only with local variable and it can not be used as formal parameter
// and class level variable also
// var keyword doesn't work in jdk 8
class VarExample{
	// var s=10; // error
	public static void main(String... s){
		System.out.println("Enter the no: ");
		var days=new java.util.Scanner(System.in).nextInt();
		System.out.println(days);
		System.out.println("Enter the name ");
		var no=new java.util.Scanner(System.in).nextLine();
		System.out.println(no);
		byte b1=10;
		byte b2=20;
		var b3=b1+b2;
		System.out.println(b3);
		var s1=new VarExample();
		System.out.println(s1);
		var ch=10;
		// ch = true;
		var z="hello";
		var b=true;
		System.out.println(ch);
		System.out.println(z);
		System.out.println(b);
		var a=10;
		var c=3;
		var d=a/c;
		System.out.println(d);
	}
}
