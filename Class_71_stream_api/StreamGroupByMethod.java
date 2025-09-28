//If the stream elements have elements where map keys are duplicate the
//we can use Collectors.groupingBy() to collect elements to map in
//Map<keyObj, List<Element>> format. Here for each map key, we will store
//all elements in a list as map value. For example, we can collect a list
//of Employee objects to map in where employee names may be duplicate
//fields for some stream elements. In such case all employees with same
//name will be stored in a list, and list will be stored as map value
//field.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupByMethod{
	public static void main(String[] args){
		List<Employee> employeeList = new ArrayList<>(Arrays.asList(
			new Employee(1,"A",100),
			new Employee(2,"A",200),
			new Employee(3,"B",300),
			new Employee(4,"B",400),
			new Employee(5,"C",500),
			new Employee(6,"C",600)));
		Map<String, List<Employee>> employeesMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
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
	public String getName(){
		return name;
	}
	public String toString(){
		return "Id="+id+" name="+name+" Salary="+salary;
	}
}
