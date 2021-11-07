import java.util.*;
public class QueueWithMax<T extends Comparable<T>>{
	Deque<T> Q=new LinkedList<>();
	Deque<T> D=new LinkedList<>();
	public void enqueue(T x) {
		Q.add(x);
		while(!D.isEmpty()) {
			if(D.getLast().compareTo(x)>=0){
				break;
			}
			D.removeLast();
		}
		D.addLast(x);
	}
	public T dequeue(){
		
		if(!Q.isEmpty()) {
			 T res=Q.remove();
			if(res.equals(D.getFirst())) {
				D.removeFirst();
			}
			return res;
		}
		throw new NoSuchElementException("Called deque on empty stack");
		
	}
	public T max() {
		if (!D.isEmpty()){
			return D.getFirst();
			}
			throw new NoSuchElementException("empty queue");
	}

	public static void main(String[] args) {
		QueueWithMax<Integer> qm=new QueueWithMax<>();
		int a[]= {3,1,3,2,0};
		for(int i=0;i<a.length;i++) {
			qm.enqueue(a[i]);
		}
		System.out.println(qm.dequeue());
		System.out.println(qm.dequeue());
		System.out.println(qm.dequeue());
		System.out.println(qm.max());
		qm.enqueue(4);
		System.out.println(qm.max());

	}

}
