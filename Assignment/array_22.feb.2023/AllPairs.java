public class AllPairs{
	public void find(int a[], int sum){
		System.out.println("Pairs");
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(sum == a[i] + a[j]){
					System.out.println("[ "+a[i]+", "+a[j]+" ]");
				}
			}
		}
	}
	
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();
		System.out.print("Enter a number for sum pair: ");
		int sum = new java.util.Scanner(System.in).nextInt();
		new AllPairs().find(a,sum);
	}
}
