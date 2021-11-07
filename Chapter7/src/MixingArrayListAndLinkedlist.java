import java.util.ArrayList;
import java.util.LinkedList;

public class MixingArrayListAndLinkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<Integer>();
		obj.add(6);
		obj.add(5);
		obj.add(7);
		obj.add(9);
		obj.add(8);
		obj.add(2);
		obj.add(3);
		System.out.println("Linkedlist :"+obj);
		
		ArrayList <Integer> arr=new ArrayList <Integer> ();
	    arr.add(10);
	    arr.add(20);
	    arr.add(30);
	    arr.add(40);
	    arr.add(50);
	    System.out.println("Arraylist :"+arr);
        	
	    //Addall Method
	    obj.addAll(arr);
        System.out.println("Combining :"+obj);
	}

}
