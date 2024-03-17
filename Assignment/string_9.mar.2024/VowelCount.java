class VowelCount{
	static int vowelCount(String s){
		int vowel=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
				vowel++;
			}
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
				vowel++;
			}
		}
		return vowel;
	}
	public static void main(String... s){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		System.out.println("\nInput String: "+str);
		int result = vowelCount(str);
		System.out.println("\nTotal vowel: "+result);
	}
}
