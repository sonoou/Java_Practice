class Expression{
	int x=2;
	int y=2;
	int z=0;
	boolean result;

	void display(){
		System.out.println("\nif x = "+x+", y = "+y+", z = "+z+". then");

		result = (x == 2);
		System.out.println("\nx == 2 \t\t\t"+result);

		result = (x != 5);
		System.out.println("x != 5 \t\t\t"+result);

		result = (x != 5 && y >= 5);
		System.out.println("x != 5 && y >=5 \t"+result);

		result = (z != 0 || x == 2);
		System.out.println("z != 0 || x == 2 \t"+result);

		result = !(y < 10);
		System.out.println("!(y < 10) \t\t"+result);
	}
	public static void main(String... s){
		Expression e=new Expression();
		e.display();
	}
}
