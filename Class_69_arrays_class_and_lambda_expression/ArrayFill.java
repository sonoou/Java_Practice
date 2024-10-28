import java.util.Arrays;

public class ArrayFill{
	public static void main(String[] arg){
		double[] data = new double[5];
		Arrays.fill(data, 1.0);

		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}
}
