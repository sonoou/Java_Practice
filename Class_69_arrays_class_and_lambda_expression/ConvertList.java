import java.util.Arrays;
import java.util.List;

public class ConvertList{
	public static void main(String[] args){
		String[] cars = {"Honda","BMW","VERNA","FORD"};
		List<String> carList = Arrays.asList(cars);

		for(String car: carList){
			System.out.println(car);
		}
	}
}
