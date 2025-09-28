class Squeeze{
	static String squeeze(String s){
		int charCount=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				charCount++;
			}
		}
		char str[]=new char[charCount];
		charCount = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				str[charCount] = s.charAt(i);
				charCount++;
			}
		}
		return new String(str);
	}
	public static void main(String... s){
		System.out.print("Enter a number: ");
		String str = StringHelper.input();
		System.out.print("\nInput string: "+str);
		String result = squeeze(str);
		System.out.print("\nAfter squeeze: "+result);
	}
}
