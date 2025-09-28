class SpaceCount{
	static int spaceCount(String s){
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				c++;
			}
		}
		return c;
	}
	public static void main(String... s){
		System.out.print("Enter a string: ");
		String str=StringHelper.input();

		int space=spaceCount(str);
		System.out.print("Total no. of spaces: "+space);
	}
}
