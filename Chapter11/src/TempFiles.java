import java.io.File;
import java.io.IOException;

public class TempFiles {

	public static void main(String[] args) throws IOException {
    File tmp=File.createTempFile("foo","txt",new File("D:\\"));
    System.out.println("Your temp file is "+tmp.getCanonicalPath());
    tmp.deleteOnExit();
    tmp.setReadOnly();
    if(tmp.canWrite()) {
    	System.out.println("possible");
    }
    else System.out.println("Not possiblle");
	}

}
