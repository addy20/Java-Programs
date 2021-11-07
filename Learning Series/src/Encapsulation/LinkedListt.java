package Encapsulation;
public class LinkedListt<E> {
	
    Node<E> head;
    public Node<E> oddEvenList(Node<E> head){
    	
    }
    
    public void display() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListt<Integer> list=new LinkedListt<>();
		
		

	}

}