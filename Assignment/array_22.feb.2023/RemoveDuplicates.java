public class RemoveDuplicates{

	public void remove(int a[]){
		int temp[] = new int[a.length];
		temp[0] = a[0];
		int index = 1;
		for(int i=0; i<a.length; i++){
			boolean addFlag = true;
			for(int j=0; j<temp.length; j++){
				if(temp[j] == a[i]){
					addFlag = false;
					break;
				}
			}
			if(addFlag){
				temp[index++] = a[i];
			}
		}
		System.out.println("Duplicate removed: ");
		for(int i=0; i<index; i++){
			System.out.print(" "+temp[i]);
		}
	}
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();
		new RemoveDuplicates().remove(a);
	}
}
