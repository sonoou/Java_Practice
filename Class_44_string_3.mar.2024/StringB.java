class StringB{
	public static void main(String... s){
		StringBuffer sb = new StringBuffer();
		//StringBuffer sb = new StringBuffer(20);
		//StringBuffer sb = new StringBuffer("appsquadz");

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1 = sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("after append");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println("after second append");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
