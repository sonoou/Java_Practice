class Temp{
	public static void main(String... s){
		byte b=10;
		byte c=20;
		byte d=b+c;
		System.out.println(d);
	}
}

/*
** What will be the output?
**  a) 10
**  b) 20
**  c) 30
**  d) Compilation error
**
** Ans. option (d), It is a compilation error bacause
** the sum of a and b is 30 and it is a integer 
** literal(constant), In java all the integer literals
** is treated as int
**
** We have to type cast the output into byte
** like this:
** 		byte d = (byte)(b+c);
*/
