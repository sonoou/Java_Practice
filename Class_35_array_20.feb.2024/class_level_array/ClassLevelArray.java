import java.util.Scanner;

public class ClassLevelArray{
	//int z[]=new int[10];
	//int z[]={10,20,30}
	int z[];

	public static void main(String[] args){
		System.out.print("Enter athe size of array: ");
		int x1=new Scanner(System.in).nextInt();

		ClassLevelArray o1=new ClassLevelArray();
		o1.z=new int[x1];

		//print proxy class name
		System.out.println(o1.z.getClass().getName());

		for(int i=0;i<o1.z.length;i++){
			o1.z[i]=new Scanner(System.in).nextInt();
		}

		for(int i=0;i<o1.z.length;i++){
			System.out.print(o1.z[i]);
			System.out.print("  ");
		}
		System.out.println(" ");

		for(int x: o1.z){
			System.out.print(x);
			System.out.print("  ");
		}
	}
}
