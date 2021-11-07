import java.util.*;
public class TestArrayList1 {

	public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println("Before Removing: "+list);
    list.remove(2);
    System.out.println("After Removing: "+list);
    
    System.out.println("Element present in the 3rd index: "+list.get(3));
    list.set(0,100);
    System.out.println("Replacing"+list);
    System.out.println("Size of arraylist: "+list.size());
    boolean x=list.contains(50);
    System.out.println(x);
	}

}
