import java.util.*;
public class INTEGERarray {

	public static void main(String[] args) {
    ArrayList arr=new ArrayList();
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    
    	System.out.println("Before :"+arr);
    	arr.remove(3);
    	System.out.println("After Removing :"+arr);
    	for(int i=0;i<arr.size();i++)
    	{
    		System.out.print(arr.get(i)+" ");
    	}
         System.out.println();
    
    System.out.println("List contains the given Object :"+arr.contains(85));
    arr.clear();
    System.out.println("After clearing element,ArrayList is :"+arr);
	}

}
