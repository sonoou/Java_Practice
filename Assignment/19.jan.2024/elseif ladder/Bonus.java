class Bonus{
	int salary;
	int yos;
	int nb;

	void input(){
		System.out.print("Enter your salary: ");
		salary=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter year of service: ");
		yos=new java.util.Scanner(System.in).nextInt();
	}
	void bonus(){
		if(yos>5){
			nb=salary*5/100;
		}
		else{
			nb=0;
		}
		System.out.println("Your net bonus is "+nb);
	}
	public static void main(String... s){
		Bonus b=new Bonus();
		b.input();
		b.bonus();
	}
}
