import java.util.Arrays;

class CumulativeFrequency{
	void cumulativefrequency(int x[]){
		int count = 0;
		// sorting
		Arrays.sort(x);

		System.out.print("Input array(sorted version): ");
		MyArrayHelper.print(x);

		System.out.println("Cumulative Frequency");
		for(int i = 0; i < x.length; i++){
			for(int j = i; j < x.length; j++){
				if(x[i] == x[j]){
					count++;
					if(j == x.length-1){
						i = j;
					}
				}
				else{
					//System.out.println(x[i]+" --> "+count);
					i = j - 1;
					break;
				}
			}
			System.out.println(x[i]+" --> "+count);
		}
	}
	public static void main(String args[]){
		int a[];
		a = MyArrayHelper.input();

		new CumulativeFrequency().cumulativefrequency(a);
	}
}	


