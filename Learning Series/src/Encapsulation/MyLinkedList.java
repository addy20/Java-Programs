 package Encapsulation;

public class MyLinkedList<E> {

	Node<E> head;
	public void add(E data) 
	{
		Node<E> toAdd=new Node<E>(data);
		if(head==null) {
			head=toAdd;
		return;
		}
		Node<E> temp=head; 
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
   public Node<E> oddevenList(Node<E> head){
	   if(head==null) {
		   return head;
	   }
	   Node<E> odd=head;
	   Node<E> oddHead=head;
	   Node<E> even=head.next;
	   Node<E> evenHead=head.next;
	   
	   while(even!=null&&even.next!=null) {
		   odd.next=odd.next.next;
		   even.next=even.next.next;
		   odd=odd.next;
		   even=even.next;
	   }
	   odd.next=evenHead;
	   
	   return oddHead;
   }
	public void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}
	public E removeLast() throws Exception {
		
		Node<E> temp=head;
		if(temp==null)
		{
			throw new Exception("Cannot remove last element from empty stack");
		}
		if(temp.next==null)
		{
			Node<E> toRemove=head;
			head=null;
			return (E) toRemove.data;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		return (E) toRemove.data;
	}
	public E getLast() throws Exception{
		Node<E> temp=head;
		if(temp==null)
		{
			throw new Exception("Empty stack Exception");
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		return temp.data;
		
	}
	
	
		
		
	}


