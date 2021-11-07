import java.io.File;
import java.io.IOException;

public class FileStatus {

	public static void main(String[] args) throws IOException{
    
		File f=new File("Sample.txt");
		f.createNewFile();
		System.out.println("New file created at\n"+f.getCanonicalPath());
		f.renameTo(new File("junk.dat"));
		System.out.println("After rename file name is "+f.getName());
		
		if(f.delete()) {
			System.out.println("Deleted");
		}
		
	}

}
