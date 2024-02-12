class InstanceFinalVariable{
	final int x=20;
	public static void main(String... s){
		InstanceFinalVariable t=new InstanceFinalVariable();
		//t.x=t.x=10;
		System.out.println(t.x);

		InstanceFinalVariable t1=new InstanceFinalVariable();
		//t1.x=t1.x+100;
		System.out.println(t1.x);
	}
}
