import java.util.*;

class MyLocale{
	public static void main(String args[]){
		//Locale l = new Locale("fr","FR");
		Locale l = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle",l);
		System.out.println(Locale.getDefault().toString());
		Enumeration e = rb.getKeys();
		while(e.hasMoreElements()){
			String k = (String)e.nextElement();
			String v = rb.getString(k);
			System.out.println(k+" = "+v);
		}
	}
}
