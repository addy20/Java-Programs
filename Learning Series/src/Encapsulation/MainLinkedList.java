package Encapsulation;
import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
    MyLinkedList<Integer> list=new MyLinkedList<>();  
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.print();
    System.out.println();
    list.oddevenList(list.head);
    list.print();
    
    
	}

}
