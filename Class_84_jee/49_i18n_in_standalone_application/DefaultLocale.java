import java.util.*;
import java.text.*;
class DefaultLocale{
	public static void main(String s[]){
		Locale list[] = DateFormat.getAvailableLocales();
		for(int i=0;i<list.length;i++){
			System.out.println(list[i].toString());
		}
	}
}
