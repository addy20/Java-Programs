import java.util.*;

class ElementWithMax{
	int element;
	int max;
	public ElementWithMax(int element,int max){
		this.element=element;
		this.max=max;
	}
}
public class MyStack {

	Deque<ElementWithMax> list=new LinkedList<>();
	public boolean empty() {
		return list.isEmpty();
	}
	public int max(){
		return list.peekFirst().max;
	}
	public void push(int x) {
		ElementWithMax temp=new ElementWithMax(x,Math.max(x, empty()?x:max()));
		list.addFirst(temp);
	}
	public int pop() throws Exception {
		if(empty()) {
			throw new Exception("Empty Stack");
		}
		return list.removeFirst().element;
	}
	public static void main(String[] args) throws Exception {
		
    MyStack st=new MyStack();
    st.push(45);
    st.push(3);
    st.push(52);
    Iterator<ElementWithMax> it=st.list.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next().element);
    }
    System.out.println(st.max());
    st.pop();
    System.out.println(st.max());
	}

}
