import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(101, "Amit");
    hm.put(102, "Amit");
    hm.put(103, "Vijay");
    hm.put(104, "Rahul");
    hm.put(105, "Gaurav");
    System.out.println("---------HashMap---------");
    for(Map.Entry k:hm.entrySet())
    {
    	System.out.println(k.getKey()+"   "+k.getValue());
    }
    boolean x=hm.containsKey(102);
    System.out.println(x);
    
    hm.remove(102);
    System.out.println("After Removing: "+hm);
    
    hm.replace(103, "Harshad");
    System.out.println("After Replacing: "+hm);
    System.out.println(hm.keySet());
    
    
	}

}
