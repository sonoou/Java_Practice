/*
** public static String copyValueOf(char[] data){
** or
** public static String copyValueOf(char[] data,int offset,int count)
*/

public class CopyValueOf{
	public static void main(String args[]){
		char Str1[] = {'h','e','l','l',' ','w','o','r','l','d'};
		String Str2 = "";

		Str2 = String.copyValueOf(Str1);
		System.out.println("Returned String: "+Str2);

		Str2 = String.copyValueOf(Str1,2,6);
		System.out.println("Returned String: "+Str2);
	}
}
