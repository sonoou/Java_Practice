import java.io.*;

public class emp extends Base implements Serializable{
	private static final long serialVersionUID = 1L;
	/*transient*/ int a;
	static int b;
	String name;
	int age;
	int salary;
	//Base b1 = new Base();
	emp(String name,int age,int a,int b,int z){
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
		this.z = z;
	}
}

