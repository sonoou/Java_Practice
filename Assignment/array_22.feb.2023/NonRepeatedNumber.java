import java.util.Scanner;


public class NonRepeatedNumber{
	public void nonRepeatedNumber(int a[]){
		for(int i = 0; i < a.length; i++){
			boolean repeat = true;
			for(int j = 0; j < a.length; j++){
				if(a[i] == a[j] && i != j){
					repeat = false;
					break;
				}
			}
			if(repeat){
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();
		new NonRepeatedNumber().nonRepeatedNumber(a);
	}
}
