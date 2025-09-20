public class MaxProduct{
	public void maxProduct(int a[]){
		int max1 = a[0];
		int max2 = a[1];
		int max3 = a[2];

		for(int i = 0; i < a.length; i++){
			if(max1 < a[i]){
				max1 = a[i];
			}
		}
		for(int i = 0; i < a.length; i++){
			if(	max2 < a[i] &&
					max2 < max1 &&
					max1 > a[i]){
				max2 = a[i];
			}
		}
		for(int i = 0; i < a.length; i++){
			if(	max3 < a[i] &&
					max3 < max2 &&
					max3 < max1 &&
					max2 > a[i] &&
					max1 > a[i]){
				max3 = a[i];
			}
		}
		System.out.print("Product of "+max3+", "+max2+" and "+max1+" is ");
		System.out.println(max3*max2*max1);
	}
	public static void main(String args[]){
		new MaxProduct().maxProduct(MyArrayHelper.input());
	}
}
