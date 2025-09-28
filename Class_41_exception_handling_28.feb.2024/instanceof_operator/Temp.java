class Temp{
	public static void main(String... s){
		try{
			int x=10/s.length;
			System.out.println(x);

			int z[]=new int[s.length];
			z[10]=1000;
		}
		catch(Exception e){
			if( e instanceof ArithmeticException){
				System.out.println(e);
			}
			if(e instanceof ArrayIndexOutOfBoundsException){
				System.out.println(e);
			}
		}
	}
}
