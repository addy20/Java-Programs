import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {

	public static void main(String[] args) {
	    ArrayList<Integer> as=new ArrayList<Integer>();
	    as.add(10);
	    as.add(20);
	    as.add(30);
	    Iterator <Integer> it=as.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
		}

}
