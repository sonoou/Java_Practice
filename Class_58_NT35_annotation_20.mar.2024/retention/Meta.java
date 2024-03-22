import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str();
	int val();
}

public class Meta{
	//Annotate a method
	@MyAnno(str = "Annotation Example",val = 100)
	public static void myMeth(){
		Meta ob = new Meta();
		try{
			Class c = ob.getClass();
			Method m= c.getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str()+" "+anno.val());
		}
		catch(NoSuchMethodException exc){
			System.out.println("Method not found");
		}
	}
	public static void main(String... s){
		myMeth();
	}
}
