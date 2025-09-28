class SizeOf{
	public static void main(String args[])
{		System.out.println("Size of byte: "+(Byte.SIZE/8)+" byte");
		System.out.println("Size of short: "+(Short.SIZE/8)+" bytes");
		System.out.println("Size of int: "+(Integer.SIZE/8)+" bytes");
		System.out.println("Size of long: "+(Long.SIZE/8)+" bytes");
		System.out.println("Size of char: "+(Character.SIZE/8)+" bytes");
		System.out.println("Size of float: "+(Float.SIZE/8)+" bytes");
		System.out.println("Size of double: "+(Double.SIZE/8)+" bytes\n");
		System.out.println("Size of boolean: not specified by the Java spec\nThe spec (§4.2.1) only guarantees that a boolean can hold the values true and\nfalse; its physical size is JVM‑dependent, so Java doesn’t expose it via a\nconstant.\n");
		System.out.println("https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html#jls-4.2.1");
	}
}
