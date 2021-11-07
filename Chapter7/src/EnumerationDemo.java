import java.util.*;


public class EnumerationDemo {

	public static void main(String[] args) {
    ArrayList list=new ArrayList(Arrays.asList(new String[] {"Apple","Cat","Dog","Rat"}));
    Vector v=new Vector(list);
    delete(v,"Dog");
	}
	private static void delete(Vector v,String name) {
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			if(s.equals(name))
			{
				v.remove(name);
			}
		}
		System.out.println("The name are : ");
		e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
	}


