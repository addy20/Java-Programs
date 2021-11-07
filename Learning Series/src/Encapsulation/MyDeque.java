package Encapsulation;

public class MyDeque<E> {
	Node<E> head,tail;
  
	public void addFirst(E data) {
		Node<E> toAdd=new Node<>(data);
		if(head==null)
		{
			head=tail=toAdd;
			return; 
		}
		
		head.prev=toAdd;
		toAdd.next=head;
		head=toAdd;
		}
public E removeLast() {
	if(head==null)
	{
		return null; 
	}
	Node<E> toRemove=tail;
	tail=tail.prev;
	tail.next=null;
	if(tail==null) {
		head=null;
	}
	return toRemove.data;
	
	}
}
