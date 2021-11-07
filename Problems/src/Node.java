

public class Node<E> {

	E data;
	Node<E> next,prev;
	public Node(E data)
	{
		this.data=data;
		this.next=this.prev=null;
	}
}
