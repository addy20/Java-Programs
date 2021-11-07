import java.util.Arrays;
import java.io.*;

public class ListDirectory {

	public static void main(String[] args) {
File dir=new File("D:\\");
String s[]=dir.list();
    for(String k:s) {
    	System.out.println(k);
    }
    File[] drives=File.listRoots();
    for(File dr:drives) {
    	System.out.println(dr);
    }
	}

}
