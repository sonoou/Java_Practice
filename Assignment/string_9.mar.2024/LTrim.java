class LTrim{
	static String lTrim(String s){
		int lspace=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				lspace++;
			}
			else{
				break;
			}
		}
		char str[]=new char[s.length()-lspace];
		for(int i=lspace;i<s.length();i++){
			str[i-lspace]=s.charAt(i);
		}
		return new String(str);
	}
	public static void main(String... s){
		System.out.print("Enter a String: ");
		String str = StringHelper.input();
		System.out.print("\nInput string:"+str+"done");
		String result = lTrim(str);
		System.out.print("\nLeft spaces removed:"+result+" done");
	}
}
