import java.io.File;

public class DeleteFolder{
	public static void main(String s[]){
		File f = new File("/home/sonu/Desktop/Java_Manish_sir/Class_66_input_output_31.mar.2024/delete_folder/7march2022");
		//System.out.println(f);
		deleteFolder(f);
		f.delete();
	}
	public static void deleteFolder(File f){
		File[] files = f.listFiles();
		for(File fi:files){
			if(fi.isDirectory()){
				deleteFolder(fi);
			}
			fi.delete();
		}
	}
}
