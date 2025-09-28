class ChangeCase{
	static String changeCase(String s){
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i] >=65 && ch[i]<=90){
				ch[i] = (char)((int)ch[i]+32);
			}
			else{
				ch[i] = (char)((int)ch[i]-32);
			}
		}
		return new String(ch);
	}
	public static void main(String... s){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		System.out.println("\nInput String: "+str);
		String result = changeCase(str);
		System.out.println("\nAfter change: "+result);
	}
}
