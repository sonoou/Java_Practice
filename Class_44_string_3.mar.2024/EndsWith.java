/*
** public boolean endsWith(Strings suffix)
*/

public class EndsWith{
	public static void main(String args[]){
		String Str = new String("This is really not immutable");
		boolean retVal;

		retVal = Str.endsWith("immutable");
		System.out.println("Returned value = "+retVal);

		retVal = Str.endsWith("table");
		System.out.println("Returned Value = "+retVal);
	}
}
