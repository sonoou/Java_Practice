/*
** public int indexOf(int ch)
** public int indexOf(int ch, int fromIndex)
** int indexOf(String str)
** int indexf(String str, int fromIndex)
*/
public class IndexOf{
	public static void main(String args[]){
		String Str = new String("Welcome to Tutorials");
		String SubStr1 = new String("Tutorials");
		String SubStr2 = new String("Sutorials");

		System.out.print("Found Index: ");
		System.out.println(Str.indexOf('o'));
		System.out.print("Found Index: ");
		System.out.println(Str.indexOf('o',5));
		System.out.print("Found Index: ");
		System.out.println(Str.indexOf(SubStr1));
		System.out.print("Found Index: ");
		System.out.println(Str.indexOf(SubStr1, 15));
		System.out.print("Found Index: ");
		System.out.println(Str.indexOf(SubStr2));
	}
}
