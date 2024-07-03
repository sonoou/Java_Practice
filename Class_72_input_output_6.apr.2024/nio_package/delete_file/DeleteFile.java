import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile{
	public static void main(String args[])throws Exception{
		Path p = Paths.get("Pathdemo.class");

		try{
			//Files.delete(p);
			boolean b = Files.deleteIfExists(p);
			//System.out.println(p+" = "+b);
			System.out.println(p+" delete successfully. ");
		}
		catch(NoSuchFileException e){
			System.out.println(p+" does not exist. ");
		}
		catch(DirectoryNotEmptyException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
