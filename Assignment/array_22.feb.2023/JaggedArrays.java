public class JaggedArrays{
	public static void check(int a[][]){
		boolean jflag = true;
		for(int i=0; i<a.length-1; i++){
			if(a[i].length != a[i+1].length){
				jflag = false;
				break;
			}
		}
		if(jflag){
			System.out.println("A jagged array");
		}
		else{
			System.out.println("An array, but don't know what king of? 🤔️");
		}
	}
	public static void main(String args[]){
		int a[][];

		System.out.print("How to many array you want: ");
		int temp = new java.util.Scanner(System.in).nextInt();
		a = new int[temp][];

		for(int i=0; i<a.length; i++){
			System.out.print("Enter size for "+(i+1)+"array: ");
			temp = new java.util.Scanner(System.in).nextInt();
			a[i] = new int[temp];
		}

		check(a);
	}
}
