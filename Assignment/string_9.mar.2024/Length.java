class Length{
	static int length(String s){
		int len=0;
		try{
			int i=0;
			while(true){
				char ch = s.charAt(i);
				i++;
				len++;
			}
		}
		catch(Exception e){
			//empty
		}
		return len;
	}
	public static void main(String s[]){
		System.out.print("Enter a string: ");
		String str=StringHelper.input();
		System.out.println("\nInput string: "+str);
		int result = length(str);
		System.out.println("String length: "+result);
	}
}
