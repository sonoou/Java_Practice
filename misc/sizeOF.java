class sizeOF{
	public static void main(String args[]){
		Boolean bool = true;
		Byte b = 10; // 1 byte
		Short s = 10; // 2 bytes
 		Integer i = 10; // 4 bytes
		Long l = 10L; // 8 bytes
		Float f = 10.3f; // 4 bytes
		Double d = 10.3434D; // 8 bytes
		//System.out.println("Size of int: "+(bool.SIZE/8));
		System.out.println("Size of byte: "+(b.SIZE/8)+" byte");
		System.out.println("Size of short: "+(s.SIZE/8)+" bytes");
		System.out.println("Size of int: "+(i.SIZE/8)+" bytes");
		System.out.println("Size of long: "+(l.SIZE/8)+" bytes");
		System.out.println("Size of float: "+(f.SIZE/8)+" bytes");
		System.out.println("Size of double: "+(d.SIZE/8)+" bytes");
	}
}
