import java.util.ArrayList;
import java.util.Collections;

public class Binarysearchh {

	public static void main(String[] args) {
    ArrayList<String> al=new ArrayList<String>();
    al.add("xyz");
    al.add("abc");
    al.add("pqr");
    Collections.sort(al);
    int x=Collections.binarySearch(al, "pqr");
    System.out.println(x);
    System.out.println(al);
	}

}
