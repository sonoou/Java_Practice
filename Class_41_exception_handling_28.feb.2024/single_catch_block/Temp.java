class Temp{
	public static void main(String... s){
		try{
			int x=10/0;
			System.out.println(x);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
