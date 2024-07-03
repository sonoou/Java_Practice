import java.io.File;

public class Rename{
	public static void main(String[] argv){
		File oldFile = new File("CWD.class");
		File newFile = new File("new_dummy125.class");
		boolean fileRenamed = oldFile.renameTo(newFile);
		if(fileRenamed){
			System.out.println(oldFile+" renamed to "+newFile);
		}
		else{
			System.out.println("Renaming "+oldFile+" to "+newFile+" failed");
		}
	}
}
