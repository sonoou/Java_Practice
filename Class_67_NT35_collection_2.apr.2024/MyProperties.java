import java.util.*;
import java.io.*;

public class MyProperties{
	public static void loadProperties(){
		Properties loadProps = new Properties();
		FileInputStream fi = null;
		try{
			fi = new FileInputStream("application.properties");
			loadProps.load(fi);

			Enumeration names = loadProps.propertyNames();
			while(names.hasMoreElements()){
				String key = (String)names.nextElement();
				String value = loadProps.getProperty(key);
				System.out.println(key+" = "+value);
			}
		}
		catch(Exception e){
			System.out.println(e+" kkkkkkk");
		}
	}
	public static void main(String args[]){
		loadProperties();
	}
}
