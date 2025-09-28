class Reverse{
	static String reverse(String s){
		char str[]=s.toCharArray();
		for(int i=0;i<str.length/2;i++){
			char temp = str[i];
			str[i] = str[str.length-1-i];
			str[str.length-1-i] = temp;
		}
		return new String(str);
	}
	public static void main(String... s){
		System.out.print("Enter a string: ");
		String str=StringHelper.input();

		String revStr = reverse(str);
		System.out.print("Reverse string: "+revStr);
	}
}
