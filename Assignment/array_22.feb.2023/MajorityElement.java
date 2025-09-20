import java.util.Arrays;

public class MajorityElement{
	public void majorityElement(int a[]){
		int majority = a.length/2;

		System.out.print("Input array: ");
		MyArrayHelper.print(a);

		Arrays.sort(a);

		for(int i = 0; i < a.length; i++){
			int count = 0;
			for(int j = i; j < a.length; j++){
				if(a[i] == a[j]){
					count++;
					if(j == a.length-1){
						i = j;
					}
				}
				else{
					//System.out.println(x[i]+" --> "+count);
					i = j - 1;
					break;
				}
			}
			if(count > majority){
				System.out.print("Majority element is ");
				System.out.println(a[i]);
				break;
			}
			if(i == a.length - 1){
				System.out.println("No majority element");
				break;
			}
		}
	}
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();
		new MajorityElement().majorityElement(a);
	}
}

