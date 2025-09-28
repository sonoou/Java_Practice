class CheckAlphabet{
	public static void main(String... s)throws java.io.IOException{
		System.out.print("Enter the character: ");
		int x=System.in.read();
		char ch=(char)x;
		if(ch=='M' || ch=='m'){
			System.out.println("\nMale");
		}
		else{
			System.out.println("\nFemale");
		}
		System.out.println(x);
		System.out.println(ch);
	}
}
