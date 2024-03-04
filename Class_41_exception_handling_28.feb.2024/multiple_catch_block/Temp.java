class Temp{
	public static void main(String... s){
		try{
			int x=10/s.length;
			System.out.println(x);
			int z[]=new int[s.length];
			z[10]=1000;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
