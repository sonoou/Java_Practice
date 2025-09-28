class Palindrome{
	static boolean palindrome(String s){
		String str = Reverse.reverse(s);
		for(int i=0;i<s.length();i++){
			if((('A'<=str.charAt(i) && str.charAt(i)<='Z') || ('a'<=str.charAt(i) && str.charAt(i)<='z')) && (('A'<=s.charAt(i) && s.charAt(i)<='Z') || ('a'<=s.charAt(i) && s.charAt(i)<='z'))){
				if(str.charAt(i)-s.charAt(i)==-32 || str.charAt(i)-s.charAt(i)==32 || str.charAt(i)-s.charAt(i)==0){
					continue;
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String... s){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		boolean p=palindrome(str);
		System.out.println((p==true)?"\nString is palindrome":"\nString is not palidrome");
	}
}
