public class FirstRepeatingElement{
	public static void find(int a[]){
		int element = 0;
		boolean flag = false;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] != a[j]){
					continue;
				}
				else{
					flag = true;
					element = a[i];
					break;
				}
			}
			if(flag){
				break;
			}
		}

		if(flag){
			System.out.println("First repeating element is "+element);
		}
		else{
			System.out.println("No element is repeating");
		}
	}
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();
		find(a);
	}
}
