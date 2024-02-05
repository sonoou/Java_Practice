class A{
	{
		System.out.println("init block of class A");
	}
	A(){
		//super();
		//init block code will be passed here after compilation
		System.out.println("A");
	}
}

class B extends A{
	{
		System.out.println("init block of class A");
	}
	B(int x){
		//super();
		// init block code will be pasted here after compilation
		System.out.println("B");
	}
	B(){
		//super();
		//init block code will be pasted here after compilation
		System.out.println("init block of class C");
	}
	
