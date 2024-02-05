class Base{
	//primitive data types are not allowed as return type
	A show(){
		System.out.println("Base");
		return new A();
	}
}
