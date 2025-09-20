public class SingleOccurence{
	public static String singleOccur(String s){
		char ch[] = new char[s.length()];
		int c = 0;
		for(int i=0; i<s.length(); i++){
			int count = 0;
			for(int j=0; j<s.length()/2; j++){
				if(s.charAt(i) == s.charAt(j) || s.charAt(i) == s.charAt(s.length()-1-j)){
					count++;
					if(count>1){
						break;
					}
				}
			}
			if(s.length()%2  != 0){
				if(s.charAt(s.length()/2 + 1) == s.charAt(i)){
					count++;
				}
			}
			if(count==1){
				ch[c++] = s.charAt(i);
			}
		}
		return new String(ch,0,c);
	}
	public static void main(String args[]){
		System.out.print("Enter a string: ");
		String s = new java.util.Scanner(System.in).nextLine();
		System.out.println(singleOccur(s));
	}
}
