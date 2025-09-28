import java.io.*;

public class emp implements Serializable{
	String s;
	int age;
	emp(int age, String s){
		this.s = s;
		this.age = age;
	}
	void show(){
		System.out.println(s+age);
	}
}

