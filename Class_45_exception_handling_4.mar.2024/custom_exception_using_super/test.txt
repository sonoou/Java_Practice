class Emp{
	int age;
	void get(int age)throws AgeException{
		if(age<18){
			throw new AgeException("Invalid age");
		}
		else{
			this.age=age;
		}
	}
	public static void main(String... s){
		Emp e1=new Emp();
		try{
			e1.get(10);
		}
		catch(AgeException e){
			System.out.println(e);
		}
	}
}

class AgeException extends Exception{
	AgeException(String s){
		super(s);
	}
}
