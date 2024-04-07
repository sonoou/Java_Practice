class RunSync{
	public static void main(String s[]){
		Shared st = new Shared();
		Thread1 t1 = new Thread1(st,"one");
		Thread2 t2 = new Thread2(st,"two");
	}
}
