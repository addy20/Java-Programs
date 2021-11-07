import java.util.*;
public class TestArrayList {

	public static void main(String[] args) {
    ArrayList list=new ArrayList();
    list.add("Aditya");
    list.add("Singh");
    
    for(int i=0;i<list.size();i++) 
    {
      System.out.print(list.get(i)+" ");
    }
    list.remove(1);
    System.out.println();
    for(int i=0;i<list.size();i++)
    {
    	System.out.println(list.get(i));
    }
    
    
	}

}
