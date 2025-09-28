class Inheritance{
	public static void main(String... s){
		System.out.println("\033[1;38;5;9m\nQue: When does inheritance happen runtime or compile time?");
		System.out.println("\033[1;38;5;6mAns: At runtime.");

		System.out.println("\033[1;38;5;9m\nQue: When we create child class object, is it possible that");
		System.out.println("     parent object is created automatically in background?");
		System.out.println("\033[1;38;5;6mAns: No. parent's object is never be created it takes area in");
		System.out.println("     child's memory and it is accessible using super");
		System.out.println("		Example:");
		System.out.println("			class Base{");
		System.out.println("				int x=10;");
		System.out.println("			}\n");
		System.out.println("			class Child extends Base{");
		System.out.println("				int x=20;\n");
		System.out.println("				void show(){");
		System.out.println("					System.out.println(x);");
		System.out.println("					Syttem.out.println(super.x);");
		System.out.println("				}");
		System.out.println("			}\n");
		System.out.println("        ┌─────────────────────────────────────────┐");
		System.out.println("        │   ┌─────────────────────┐               │");
		System.out.println("        │   │  x=10    !   x=20   │               ├──> Heap");
		System.out.println("        │   │          !          │               │");
		System.out.println("        │   └────┬──────────┬─────┘               │");
		System.out.println("        └────────┼──────────┼─────────────────────┘");
		System.out.println("                 │          │                      ");
		System.out.println("               super      this                     ");
	}
}
