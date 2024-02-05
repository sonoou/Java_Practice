class Attendence{
	int tc;
	int ca;

	void input(){
		System.out.print("Enter number of classes held: ");
		tc=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter number of classes attended: ");
		ca=new java.util.Scanner(System.in).nextInt();
	}
	void percentage(){
		float p=(float)ca/tc*100;
		if(p<75){
			System.out.println("\nAttendence is "+p+"%");
			System.out.println("You are not allowed to sit in exam");
		}
		else{
			System.out.println("\nAttendence is "+p+"%");
			System.out.println("You are allowed to sit in exam");
		}
	}
	public static void main(String... s){
		Attendence a=new Attendence();
		a.input();
		a.percentage();
	}
}
