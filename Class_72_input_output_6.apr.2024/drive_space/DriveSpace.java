import java.io.File;

public class DriveSpace{
	public static void main(String args[]){
		File file = new File("/");
		long totalSpace = file.getTotalSpace();
		System.out.println("Total space on "+file+" = "+totalSpace+" bytes");
		long l = 1024*1024*1024;
		System.out.println(totalSpace/l);
		long freeSpace = file.getFreeSpace();
		System.out.println("Free space on"+file+" = "+freeSpace+" bytes");
		System.out.println(freeSpace/l);
	}
}
