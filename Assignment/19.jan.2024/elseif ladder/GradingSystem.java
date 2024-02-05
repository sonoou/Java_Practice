class GradingSystem{
	int m;

	void input(){
		System.out.print("Enter your marks: ");
		m=new java.util.Scanner(System.in).nextInt();
	}
	void grade(){
		if(m<25){
			System.out.println("Grade F");
		}
		else if(m>=25 && m<45){
			System.out.println("Grade E");
		}
		else if(m>=45 && m<50){
			System.out.println("Grade D");
		}
		else if(m>=50 && m<60){
			System.out.println("Grade C");
		}
		else if(m>=60 && m<=80){
			System.out.println("Grade B");
		}
		else if(m>80){
			System.out.println("Grade A");
		}
		else{
			System.out.println("Marks can not be negative");
		}
	}
	public static void main(String... s){
		GradingSystem gs=new GradingSystem();
		gs.input();
		gs.grade();
	}
}
