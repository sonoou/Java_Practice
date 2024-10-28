import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class LoadProperties{
	public static void propLoad(String path){
		try{
			FileInputStream fn = new FileInputStream(path);
			Properties pr = new Properties();
			pr.load(fn);
			Enumeration en = pr.propertyNames();
			while(en.hasMoreElements()){
				String key = (String)en.nextElement();
				String value = pr.getProperty(key);
				System.setProperty(key,value);
				System.out.println(key+" : "+value);
			}
		}
		catch(Exception e){
		}
	}
}
