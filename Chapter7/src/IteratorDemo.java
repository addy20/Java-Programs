import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class IteratorDemo {

	public static void main(String[] args) {
    ArrayList list=new ArrayList(Arrays.asList(new String[] {"Apple","Cat","Dog","Rat"}));
    Vector v=new Vector(list);
    delete(v,"Dog");
	}
	private static void delete(Vector v,String name) {
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			String s=(String)i.next();
			if(s.equals(name))
			{
				i.remove();
			}
		}
		System.out.println("The name are : ");
		i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	}


