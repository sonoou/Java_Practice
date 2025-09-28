class ComparisonPool{
	public static void main(String s[]){
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		boolean r = i1==i2;
		System.out.println(r);
		Integer i4 = 127; //127
		Integer i5 = 127; //127
		r = i4==i5;
		System.out.println(r);
	}
}
