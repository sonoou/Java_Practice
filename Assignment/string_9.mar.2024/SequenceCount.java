class SequenceCount{
	static void sequenceCount(String s){
		int scount=0;
		int i=0;
		for(i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				scount++;
			}
			else{
				scount++;
				System.out.println(s.charAt(i-1)+" "+scount);
				scount=0;
			}
		}
		scount++;
		System.out.println(s.charAt(i-1)+" "+scount);
	}
	public static void main(String s[]){
		System.out.print("Enter a string: ");
		String str = StringHelper.input();
		System.out.print("\nInput string: "+str);
		System.out.println("\nSequence of string characters");
		sequenceCount(str);
	}
}
