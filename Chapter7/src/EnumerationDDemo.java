import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class EnumerationDDemo {

	public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();
    list.add("Apple");
    list.add("Cat");
    list.add("Dog");
    list.add("Rat");
    delete(list,"Dog");
	}
	private static void delete(ArrayList list,String name) {
		Enumeration it=Collections.enumeration(list);
		while(it.hasMoreElements())
		{
			/*if(it.nextElement().equals(name))
			{
				list.remove(name);
			}*/
			System.out.println("The name are :"+ it.nextElement());
		}
		
		
	}
	}


