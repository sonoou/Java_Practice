class LeapYear{
	int y;

	void input(){
		System.out.print("Enter the year: ");
		y=new java.util.Scanner(System.in).nextInt();
	}

	void checkLeap(){
		int a = y%100;
		if(a==0){
			int b=y%400;
			if(b==0){
				System.out.println("\nIt is a leap year");
			}
			else{
				System.out.println("\nIt is not a leap year");
			}
		}
		else{
			int c=y%4;
			if(c==0){
				System.out.println("\nIt is a leap year");
			}
			else{
				System.out.println("\nIt is not a leap year");
			}
		}
	}
	public static void main(String... s){
		LeapYear ly=new LeapYear();
		ly.input();
		ly.checkLeap();
	}
}
