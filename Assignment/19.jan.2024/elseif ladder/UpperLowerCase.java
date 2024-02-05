class UpperLowerCase{
	public static void main(String... s)throws java.io.IOException{
		int a;
		char c;

		System.out.print("Enter a alphabet character: ");
		a=System.in.read();

		if(a>=65 && a<=90){
			c = (char)a;
			System.out.println("\n"+c+" is uppercase letter");
		}
		else if(a>=97 && a<=122){
			c = (char)a;
			System.out.println("\n"+c+" is lowercase letter");
		}
		else{
			c = (char)a;
			System.out.println("\n"+c+" is not a alphabet letter");
		}
	}
}
