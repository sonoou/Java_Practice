import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilterEx{
	public static void main(String args[]){
		String dirname = "/home/sonu/Desktop/Java_Manish_sir/Assignment/pattern_25.jan.2024";
		File f1 = new File(dirname);
		FilenameFilter only = new ExtensionFilter("java");
		String s[] = f1.list(only);
		for(int i = 0;i < s.length; i++){
			System.out.println(s[i]);
		}
	}
}
class ExtensionFilter implements FilenameFilter{
	String ext;
	int i=1;
	public ExtensionFilter(String ext){
		this.ext = "."+ext;
	}
	public boolean accept(File dir, String name){
		System.out.println("accept");
		return name.endsWith(ext);
	}
}
