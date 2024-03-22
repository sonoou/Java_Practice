class FrequencyCount{
	static void frequencyCount(String s){
		char ch[] = new char[s.length];
		int scount=0;
		int c=0;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				continue;
			}
			else{
				ch[c] = s.charAt(i-1);
				c++;
			}
		}
		ch[c] = s.charAt(i-1);

		for(int i=0;i<c;
	}
	public static void main(String s[]){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		System.out.print("\nInput string: "+str);
		System.out.println("\nSequence of string characters");
		frequencyCount(str);
	}
}
