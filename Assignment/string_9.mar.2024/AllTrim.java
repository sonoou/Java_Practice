class AllTrim{
	static String allTrim(String s){
		int lspace=0, rspace=0;

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				lspace++;
			}
			else{
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				rspace++;
			}
			else{
				break;
			}
		}
		char str[] = new char[s.length()-lspace-rspace];
		for(int i=lspace;i<s.length()-rspace;i++){
			str[i-lspace]=s.charAt(i);
		}
		return new String(str);
	}
	public static void main(String... s){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		System.out.println("\nInput string:"+str+"done");
		String result = allTrim(str);
		System.out.println("\nLeading and trailing spaces removed:"+result+"done");
	}
}
