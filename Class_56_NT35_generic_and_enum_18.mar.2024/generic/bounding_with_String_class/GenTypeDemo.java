// Here, T is bound by String.
class GenStr<T extends String>{
	T str; //here, T will be replace by String
	GenStr(T o){
		str = o;
	}
	T getstr(){
		return str;
	}
}

public class GenTypeDemo{
	public static void main(String args[]){
		GenStr<String> fOb = new GenStr<String>("aa");
		System.out.println(fOb.getstr());
	}
}
