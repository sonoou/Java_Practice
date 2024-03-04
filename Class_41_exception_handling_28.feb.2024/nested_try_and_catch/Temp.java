class Temp{
	public static void main(String... s){
		try{
			try{
				int x=10/s.length;
				System.out.println(x);
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int z[]=new int[s.length];
				z[10]=1000;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
