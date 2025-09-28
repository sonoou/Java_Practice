class B extends A{
	B(int x){
		//super() -> implicit super() inserted by compiler
		System.out.println(x);
	}
	B(){
		//super() -> implicit super() inserted by compiler
		System.out.println("B");
	}
}
