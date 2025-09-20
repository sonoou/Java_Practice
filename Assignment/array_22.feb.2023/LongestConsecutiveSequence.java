import java.util.Arrays;

public class LongestConsecutiveSequence{
	public void consecutiveSequence(int a[]){
		int prevLength = 0;

		int startSeq = 0;
		int endSeq = 0;

		// find max value element
		int max = a[0];
		for(int i = 0; i < a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		}

		for(int i = 0; i < a.length; i++){
			int currLength = 0;
			int start = a[i];
			for(int j = 0; j < a.length; j++){
//			System.out.println("i = "+i+" , j = "+j+" Seq for "+start+" with inc & comp with "+a[j]);
				if( (start + 1 == a[j])  &&  i != j ){
					start = a[j];
					j = -1;
					currLength++;
				}
				if(max == start){
					break;
				}
			}
			if(prevLength < currLength){
				startSeq = a[i];
				endSeq = startSeq + currLength;
				prevLength = currLength;
			}
		}
		System.out.println(startSeq+"  "+endSeq);
	}
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();

		new LongestConsecutiveSequence().consecutiveSequence(a);
	}
}
