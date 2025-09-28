class ThrowEx{
	int age;
	void getAge(int age){
		if(age<18){
			try{
				throw new ArithmeticException("invalid age");
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
				System.out.println(e);
			}
		}
		else{
			this.age=age;
		}
	}
	public static void main(String... s){
		new ThrowEx().getAge(10);
	}
}
