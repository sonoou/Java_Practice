class RTrim{
	static String rTrim(String s){
		int rspace=0;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				rspace++;
			}
			else{
				break;
			}
		}
		char str[] = new char[s.length()-rspace];
		for(int i=0;i<s.length()-rspace;i++){
			str[i]=s.charAt(i);
		}
		return new String(str);
	}
	public static void main(String... s){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		System.out.println("\nInput String:"+str+"done");
		String result = rTrim(str);
		System.out.println("\nRight spaces removed:"+result+"done");
	}
}
