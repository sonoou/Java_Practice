class CheckSquare{
	int length;
	int breadth;

	void input(){
		System.out.print("Enter length of rectangle: ");
		length=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter breadth of rectangle: ");
		breadth=new java.util.Scanner(System.in).nextInt();
	}
	void check(){
		if(length==breadth){
			System.out.println("It is a square");
		}
		else{
			System.out.println("It is a rectangle");
		}
	}
	public static void main(String... s){
		CheckSquare cs=new CheckSquare();
		cs.input();
		cs.check();
	}
}
