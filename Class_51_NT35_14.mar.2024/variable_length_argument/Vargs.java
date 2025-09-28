class Vargs{
	void show(int z, int... x){
		System.out.println(z);
		for(int i=0;i<x.length;i++){
			System.out.println(x[0]);
		}
		for(int i:x){
			System.out.println(i);
		}
	}
	public static void main(String s[]){
		int z1[]={10,10,10,10};
		new Vargs().show(100,10,10,10,10);
		new Vargs().show(100, z1);
	}
}
