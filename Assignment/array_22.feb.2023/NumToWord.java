class NumToWord{
	void numtoword(int x[]){
		int word=0;

		for(int i=0;i<x.length;i++){
			word=word*10+x[i];
		}
		System.out.println("Num to word: "+word);
	}
	public static void main(String... s){
		int a[]=Array.input();
		NumToWord n=new NumToWord();
		n.numtoword(a);
	}
}
