import java.util.*;
public class HashSett {

	public static void main(String[] args) {
    HashSet<String> A=new HashSet<String>();
    A.add("one");
    A.add("Two");
    A.add("Three");
    A.add("Four");
    A.add("Three");
    A.add("Five");
    Iterator<String> i=A.iterator();
    //HashSet doesn't allow duplicate elements
   /* while(i.hasNext())
    {
    	System.out.println(i.next());
    }*/
    
    
	A.forEach(s -> System.out.println(s)); 
	}

}
