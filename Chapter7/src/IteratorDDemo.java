import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class IteratorDDemo {

	public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();
    list.add("Apple");
    list.add("Cat");
    list.add("Dog");
    list.add("Rat");
    delete(list,"Dog");
	}
	private static void delete(ArrayList list,String name) {
		Iterator <String> it=list.iterator();
		while(it.hasNext())
		{
			//String s=it.next();
			if(it.next().equals(name))
			{
				it.remove();
			}
		}
		System.out.println("The name are : ");
		it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	}


