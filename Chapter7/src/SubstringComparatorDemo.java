import java.util.*;

class SubstringComparator implements Comparator<String>{
   public int compare(String s1,String s2){
         s1=s1.substring(1);
         s2=s2.substring(1);
         return s1.compareTo(s2);
    }
}
public class SubstringComparatorDemo {

	public static void main(String[] args) {
		String[] strings= {"painful","mainly","gaining","raindrops"};
	    Arrays.sort(strings);
	    dump(strings,"Using Default Sort");
	    Arrays.sort(strings,new SubstringComparator());
	    dump(strings,"Using SubstringComparator");}
	    static void dump(String[]args,String title)
	    {
	    	System.out.println(title);
	    	for(int i=0;i<args.length;i++)
	    	{
	    		System.out.println(args[i]);
	    	}
	    }
	    
	}


