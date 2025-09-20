class FrequencyCount{
	public static void frequencyCount(String s){
		char ch[] = new char[s.length()];
		int c=0;
		int i = 1;
		for(i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				continue;
			}
			else{
				ch[c] = s.charAt(i-1);
				c++;
			}
		}
		ch[c] = s.charAt(i-1);
		for(i=0;i<c;i++){
			int scount=0;
			for(int j=0; j<s.length(); j++){
				if(ch[i] == s.charAt(j)){
					scount++;
				}
			}
			System.out.println(ch[i]+" -> "+scount);
		}
	}
	public static void main(String s[]){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		System.out.print("\nInput string: "+str);
		System.out.println("\nSequence of string characters");
		frequencyCount(str);
	}
}
