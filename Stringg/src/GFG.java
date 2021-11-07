// Java program to implement Queue using
// two stacks with costly enQueue()
import java.util.*;

class GFG
{
static class Queue
{
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	static void enQueue(int x)
	{
		s1.push(x);
	}

	// Dequeue an item from the queue
	static int deQueue()
	{
		if(s2.isEmpty()) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}}
		if(!s2.isEmpty()) {
			return s2.pop();
		}
		throw new NoSuchElementException("Popping from empty stack");
	}
	static void display() {
		System.out.println(s1);
	}
};

// Driver code
public static void main(String[] args)
{
	Queue q = new Queue();
	q.enQueue(1);
	q.enQueue(2);
	q.enQueue(3);
    System.out.println(q.deQueue());
	
}
}

// This code is contributed by Prerna Saini
