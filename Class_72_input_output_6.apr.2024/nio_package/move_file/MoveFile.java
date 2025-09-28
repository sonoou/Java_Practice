import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile{
	public static void main(String args[]){
		Path source = Paths.get("/copyoftest.txt");
		Path target = Paths.get("./copy30.txt");

		try{
			Path p = Files.move(source, target, ATOMIC_MOVE);
			System.out.println(source+" has been moved to "+p);
		}
		catch(NoSuchFileException e){
			System.out.println(target+" already exists. Move failed.");
		}
		catch(FileAlreadyExistsException e){
			System.out.println(target+" is not empty. Move failed.");
		}
		catch(AtomicMoveNotSupportedException e){
			System.out.println("Atomic move is not supported. Move failed.");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}