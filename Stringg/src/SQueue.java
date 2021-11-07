import java.util.*;
public class SQueue {
    Deque<Integer> enq=new LinkedList<>();
    Deque<Integer> deq=new LinkedList<>();
    
    public void enqueue(int x) {
    	enq.addFirst(x);
    }
    public int dequeue() {
    	if(deq.isEmpty()) {
    		while(!enq.isEmpty()) {
    			deq.addFirst(enq.removeFirst());
    		}
    	}
    	if(!deq.isEmpty()) {
    		return deq.removeFirst();
    	}
    	throw new NoSuchElementException("Popping from empty queue");
    }
 
	public static void main(String[] args) {
		
    SQueue sq=new SQueue();
    sq.enqueue(1);
    sq.enqueue(2);
    sq.enqueue(3);
    sq.enqueue(4);
    sq.enqueue(5);
    
    System.out.println(sq.dequeue());
    
	}

}
