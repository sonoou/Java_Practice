class Attendence2{
	public static void main(String... s)throws java.io.IOException{
		int tc;
		int ca;
		int med;
		char ch;

		System.out.print("Enter the number of classes held: ");
		tc=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter the number of classes attended: ");
		ca=new java.util.Scanner(System.in).nextInt();
		System.out.print("Do you have medical cause(Y or N): ");
		med=System.in.read();
		ch=(char)med;

		float p=(float)ca/tc*100;
		if(p<75 && (ch=='y' || ch=='Y')){
			System.out.println("\nAttendence is "+p+"%");
			System.out.println("You are allowed to sit in exam");
		}
		else if(p<75 && (ch=='n' || ch=='N')){
			System.out.println("\nAttendence is "+p+"%");
			System.out.println("You are not allowed to sit in exam");
		}
		else{
			System.out.println("\nAttendence is "+p+"%");
			System.out.println("You are allowed to sit in exam");
		}
	}
}
