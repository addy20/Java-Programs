import java.util.ArrayList;
import java.util.Iterator;
import java.util. Enumeration;
import java.util.*;
public class AllMethodsOfIteration {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("One");
		arrList.add("Two"); 
		arrList.add("Three"); 
		
		System.out.println("Iterable.forEach method (Java 8) : " ); 
		arrList.forEach(s -> System.out.println(s)); 
		
		System.out.println("Java foreach loop (Java 5) : " );
		for (String name : arrList) 
		{
		System.out.println(name);
	    }
		
		System.out.println("Three-part for loop: ");
		for(int i=0;i<arrList.size();i++) 
		{
		  System.out.println(arrList.get(i));
		}
		  
		System.out.println("while loop :");
		Iterator<String> iter=arrList.iterator();
		while(iter.hasNext())
		  {
		    System.out.println(iter.next());
		  }
		 
		System.out.println("java.util.Iterator (Java 2): ");
	    Iterator it = arrList.iterator();
		  while (it.hasNext()) 
		  {
		    Object o=it.next();
   		    System.out.println(o);
		  }
		 
		 // creating object of type Enumeration<String>
		 Enumeration<String> e = Collections.enumeration(arrList); 
		 System.out.println("Enumeration over list: ");
		 while (e.hasMoreElements()) 
		 {
		   System.out.println("Value is:" + e.nextElement());
         }
           }
		}
	
