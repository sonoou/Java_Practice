//If the stream elements have the unique map key field then we can use
//Collectos.toMap() to collect elements to map in Map<keyObj, Element>
//format easily. For example, we can collect a list of Employee objects
//to map in where employee ids are unique field and used a key to map
//entries.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamToMapMethod{
	public static void main(String[] args){
		List<Employee> employeeList = new ArrayList<>(Arrays.asList(
			new Employee(1,"A",100),
			new Employee(2,"A",200),
			new Employee(3,"B",300),
			new Employee(4,"B",400),
			new Employee(5,"C",500),
			new Employee(6,"C",600)));
		Map<Integer, Employee> employeesMap = employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
		System.out.println(employeesMap);
	}
}
class Employee{
	int id;
	String name;
	int salary;
	Employee(int id,String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId(){
		return id;
	}
	public String toString(){
		return "Id="+id+" name="+name+" Salary="+salary;
	}
}


