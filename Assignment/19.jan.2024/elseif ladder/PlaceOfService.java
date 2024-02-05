class PlaceOfService{
	public static void main(String... s)throws java.io.IOException{
		System.out.print("Enter your age: ");
		int age=new java.util.Scanner(System.in).nextInt();

		System.out.print("Enter your gender(M or F): ");
		int g=System.in.read();
		char gender=(char)g;

		System.out.print("Enter your marital status(Y or N): ");
		char m =new java.util.Scanner(System.in).next().Atchar(0);

		if(gender=='f' || gender=='F'){
			System.out.println("\nShe will work only in urban areas.");
		}
		else if((gender=='m' || gender=='M') && (age>=20 && age<=40)){
			System.out.println("\nHe can work in anywhere.");
		}
		else if((gender=='m' || gender=='M') && (age>40 && age<=60)){
			System.out.println("\nHe will work only in urban areas.");
		}
		else{
			System.out.println("\nERROR");
		}
	}
}
