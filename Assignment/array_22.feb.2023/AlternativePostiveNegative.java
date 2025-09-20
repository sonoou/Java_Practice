public class AlternativePostiveNegative{
	public static int returnNegPos(int fromWhich, int[] a,int negPos){
		for(int i=fromWhich; i<a.length; i++){
			if(negPos < 0 && a[i] < 0){
				return i;
			}
			if(negPos >= 0 && a[i] >= 0){
				return i;
			}
		}
		return -1;
	}
	public static void arrange(int a[]){
		for(int i=0; i<a.length-1; i++){
			if(a[i] < 0){
				if(a[i+1] >= 0){
				//	i = i+1;
					continue;
				}
				int ind = returnNegPos(i+1,a,1);
				if(ind < 0){
					break;
				}
				int temp = a[ind];
				a[ind] = a[i+1];
				a[i+1] = temp;
			//	i = i+1;
			}
			else{
				if(a[i+1] < 0){
				//	i = i+1;
					continue;
				}
				int  ind = returnNegPos(i+1,a,-1);
				if(ind < 0){
					break;
				}
				int temp = a[ind];
				a[ind] = a[i+1];
				a[i+1] = temp;
			//	i = i+1;
			}
		}
		System.out.println("Rearranged array");
		for(int v:a){
			System.out.print(" "+v);
		}
	}
	public static void main(String args[]){
		int a[] = MyArrayHelper.input();
		arrange(a);
	}
}
