class Temp{
	public static void main(String... s){
		Demo d1=new Demo();
		d1=null;
		for(int i=0;i<=2000;i++){
			System.gc();
			//Runtime.gc();
		}
	}
}
