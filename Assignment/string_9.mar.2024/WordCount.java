class WordCount{
	static int wordCount(String s){
		String str=s.trim();
		int c=0;
		for(int i=0;i<s.length();i++){
			if(str.charAt(i)==' '){
				c++;
			}
		}
		return c+1;
	}
	public static void main(String... a){
		System.out.print("Enter a string: ");
		//String s=StringHelper.input();
		System.out.println("\nTotal number of words are: "+wordCount(StringHelper.input()));
	}
}
