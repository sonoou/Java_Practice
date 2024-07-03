import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.DirectoryNotEmptyException;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;

public class CopyFile{
	public static void main(String[] args){
		Path source = Paths.get("/copyoftest.txt");
		Path target = Paths.get("/home/sonu/copy30.txt");

		try{
			Path p = Files.copy(source, target, REPLACE_EXISTING, COPY_ATTRIBUTES);
			System.out.println(source+" has been copied to "+p);
		}
		catch(FileAlreadyExistsException e){
			System.out.println(target+" already exists.");
		}
		catch(DirectoryNotEmptyException e){
			System.out.println(target+" is not empty. ");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}