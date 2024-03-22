import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
	String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "class",val = 99)
public class Meta2{
	@What(description = "An annotation test method")
	@MyAnno(str = "Method",val = 100)
	public static void myMeth(){
		Meta2 ob = new Meta2();
		try{
			Annotation annos[] = ob.getClass().getAnnotations();
			MyAnno mn = ob.getClass().getAnnotation(MyAnno.class);
			System.out.println(mn.getClass().getName());
			System.out.println(mn.str());
			System.out.println(mn.val());
			// Display all annotations for Meta2
			for(int i=0;i<annos.length;i++){
				System.out.println(annos[i]);
			}
			System.out.println();
			//Display all annotations for myMeth.
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();

			System.out.println("All annotations for myMeth:");
			for(int i=0;i<annos.length;i++){
				System.out.println(annos[i]);
			}
		}
		catch(NoSuchMethodException exc){
			System.out.println("Method not found");
		}
	}
	public static void main(String... s){
		myMeth();
	}
}
