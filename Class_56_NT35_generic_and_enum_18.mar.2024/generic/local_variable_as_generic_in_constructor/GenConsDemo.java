class GenCons{
	private double val;

	<T extends Number> GenCons(T arg){
		val = arg.doubleValue();
	}
	void showVal(){
		System.out.println("Val: "+val);
	}
}

public class GenConsDemo{
	public static void main(String args[]){
		//GenCons test1 = new GenCons('a');
		GenCons test = new GenCons(100);
		GenCons test2 = new GenCons(123.5f);

		test.showVal();
		test2.showVal();
	}
}
