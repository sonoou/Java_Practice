class GetBytes{
	public static void main(String args[]){
		String Str1  = new String("Welcome to Tutorials of string");
		try{
			byte[] Str2=Str1.getBytes();
			for(int i=0;i<Str2.length;i++){
				System.out.println(Str2[i]);
			}
		}
		catch(Exception e){
			System.out.println("Unsupported character set");
		}
	}
}
