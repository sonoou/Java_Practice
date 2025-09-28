public class IsInterface{
	public static void main(String[] args)throws Exception{
		Class clazz = int.class;
		Class ar = int[].class;
		Class c = java.io.Serializable.class;

		boolean isInterface = clazz.isPrimitive();
		boolean isInterface1 = c.isInterface();
		boolean isInterface2 = ar.isArray();

		System.out.println(ar.getName());
		Class inter[] = ar.getInterfaces();

		for(int i=0;i<inter.length;i++){
			System.out.println(inter[i].getName());
		}
		System.out.println("IsPrimitive = "+isInterface);
		System.out.println("IsInterface = "+isInterface1);
		System.out.println("IsArray = "+isInterface2);
	}
}
