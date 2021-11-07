import java.util.*;
public class MyQueue {
	int head=0,tail=0,total=0;
	public static final int SCALE_FACTOR=2;
	int [] entries;
	public MyQueue(int capacity) {
		entries=new int[capacity];
	}
	
	
	public void enQueue(int x) {
		if(total==entries.length) {
			Collections.rotate(Arrays.asList(entries), -head);
			head=0;
			tail=total;
			entries=Arrays.copyOf(entries, total*SCALE_FACTOR);
		}
		entries[tail]=x;
		System.out.println();
		tail=(tail+1)%entries.length;
		total++;
	}
	public int deQueue() {
		if(total!=0) {
			total--;
			int ret=entries[head];
			head=(head+1)%entries.length;
			return ret;
		}
		throw new NoSuchElementException("Empty stack");
	}
	public int size() {
		return total;
	}

	public static void main(String[] args) {
		
    MyQueue mq=new MyQueue(4);
    mq.enQueue(4);
    mq.enQueue(3);
    mq.enQueue(2);
    mq.enQueue(1);
    System.out.println(mq.deQueue());
    mq.enQueue(5);
    mq.enQueue(6);
    for(int i=0;i<mq.entries.length;i++) {
    	System.out.print(mq.entries[i]);
    }
    
	}

}
