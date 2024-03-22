class IntToBinary{
	public static void main(String... s){
		String s1 = Integer.toBinaryString(10);
		String s2 = Integer.toHexString(10);
		String s3 = Integer.toOctalString(10);

		System.out.println(s1+"\n"+s2+"\n"+s3+"\n");
	}
}
