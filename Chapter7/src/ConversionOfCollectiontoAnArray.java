import java.util.*;

public class ConversionOfCollectiontoAnArray {

	public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();
    list.add("abc");
    list.add("pqr");
    list.add("xyz");
    
    String[] sl=list.toArray(new String[0]);
    
    System.out.println("Array of String has length "+sl.length);
	}

}
