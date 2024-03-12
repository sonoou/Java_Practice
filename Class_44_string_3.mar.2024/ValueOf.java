public class ValueOf{
	public static void main(String args[]){
		int i = 10;
		short s = 5;
		byte by = 2;
		float f = 39348.43833f;
		double d = 102939939.939;
		boolean b = true;
		long l = 1232874;
		char[] arr = {'a','b','c','d','e','f','g'};

		System.out.println("Return Value: "+String.valueOf(i));
		System.out.println("Return Value: "+String.valueOf(s));
		System.out.println("Return Value: "+String.valueOf(by));
		System.out.println("Return Value: "+String.valueOf(f));
		System.out.println("Return Value: "+String.valueOf(d));
		System.out.println("Return Value: "+String.valueOf(b));
		System.out.println("Return Value: "+String.valueOf(l));
		System.out.println("Return Value: "+String.valueOf(arr));
	}
}
