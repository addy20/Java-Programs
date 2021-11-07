

public class Linkedd {
	 Node head;
	public static class Node {

		int data;
		Node next,prev;
		public Node(int data)
		{
			this.data=data;
			this.next=this.prev=null;
		}
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}

	}
	public void addAtHead(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addAtTail(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
	}
	public Node mergeLists(Node l1,Node l2){
		Node dummyNode=new Node(0);
		Node curr=dummyNode;
		Node p1=l1;
		Node p2=l2;
		
		while(p1!=null&&p2!=null) {
			if(p1.data<=p2.data) {
				curr.next=p1;
				p1=p1.next;
			}else
			{
				curr.next=p2;
				p2=p2.next;
			}
			curr=curr.next;
		}
		
		curr.next=p1!=null?p1:p2;
		return dummyNode.next;	
	}
	public static Node mergeList(Node l1,Node l2){
		Node dummyHead=new Node(0);
		Node curr=dummyHead;
		Node p1=l1;
		Node p2=l2;
		
		while(p1!=null&&p2!=null) {
			if(p1.data<=p2.data) {
				curr.next=p1;
				p1=p1.next;
			}else
			{
				curr.next=p2;
				p2=p2.next;
			}
			curr=curr.next;
		}
		
		curr.next=p1!=null?p1:p2;
		return dummyHead.next;	
	}
	public Node reverseSubList(Node l1,int s,int f) {
		if(s==f) {
			return l1;
		}
		
		Node sHead=l1;
		int k=1;
		while(k++<s) {
			sHead=sHead.next;
		}
		Node sIter=sHead.next;
		while(s++<f) {
			Node tmp=sIter.next;
			sIter.next=tmp.next;
			tmp.next=sHead.next;
			sHead.next=tmp;
		}
		return sHead.next;
	}
	public static Node reverseList(Node slow) {
		Node sHead=slow;
		Node iter=sHead.next;
		Node temp=iter.next;
		while(temp!=null) {
			
			iter.next=temp.next;
			temp.next=sHead.next;
			sHead.next=temp;
			temp=iter.next;
		}
		return sHead.next;
	}
	public static Node hasCycle(Node head) {
		Node fast=head,slow=head;
		while(fast!=null&&fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow.data==fast.data) {
				slow=head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
				
		}
		return null;
	} 
	public static Node removeKthLast(Node head,int k) {
		Node first=head,prev=head;
		while(k-->0) {
			first=first.next;
		}
		while(first.next!=null) {
			first=first.next;
			prev=prev.next;
		}
		prev.next=prev.next.next;
		return head;
	}
	public static Node removeDuplicates(Node head) {
		Node iter=head;
		while(iter!=null) {
			Node nD=iter.next;
			while(nD!=null&&nD.data==iter.data) {        //nD=nextDistinct
				nD=nD.next;
			}
			iter.next=nD;
			iter=nD;
		}
		return head;
		
	}
	public static boolean isLinkedListAPalindrome(Node head) {
		if(head==null) {
			return true;
		}
		Node slow=head,fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		Node firstHalf=head;
		Node secondHalf=reverseList(slow);
		while(secondHalf!=null&&firstHalf!=null) {
			if(firstHalf.data!=secondHalf.data) {
				return false;
			}
			secondHalf=secondHalf.next;
			firstHalf=firstHalf.next;
		}
		return true;
	}
	public static Node listPivoting (Node head, int x) {
		Node lessHead = null;
		Node equalHead = null;
		Node greaterHead = null;
		Node lessIter =lessHead;
		Node equalIter = equalHead;
		Node greaterIter = greaterHead;
		
		
		while (head!= null) {
		if (head.data < x) {
			if(lessHead==null) {
				lessIter=lessHead=head;
			}else {
			lessIter.next=head;
			lessIter=lessIter.next;
			}
		}else if(head.data == x) {
			if(equalHead==null) {
				equalIter=equalHead=head;
			}else {
			equalIter.next=head;
			equalIter=equalIter.next;
			}
		}else{
			if(greaterHead==null) {
				greaterIter=greaterHead=head;
			}else {
			greaterIter.next=head;
			greaterIter=head;
			}
		}
		head=head.next ;
		}
		greaterIter.next = null;
		lessIter.next =equalHead;
		equalIter.next =greaterHead;
		
		return lessHead;
		
//		To print the elements
//		while(lessHead.next!=null) {
//			System.out.print(lessHead.next.data+" -> ");           
//			lessHead=lessHead.next;
//		}
      }
	public static Node partitionList(Node head,int x){
		Node lessHead = new Node(0);
		
		Node greaterHead = new Node(0);
		Node lessIter =lessHead;
		
		Node greaterIter = greaterHead;
		
		
		while (head!= null) {
		if (head.data < x) {
			
			lessIter.next=head;
			lessIter=lessIter.next;
			
		}else{
			
			greaterIter.next=head;
			greaterIter=head;
			
		}
		head=head.next ;
		}
		
		lessIter.next =greaterHead.next;
		greaterIter.next = null;
		
		return lessHead.next;
		
	}

	public static void main(String[] args) {
		Linkedd list=new Linkedd();
		list.addAtHead(1);
		list.addAtTail(1);
		
		partitionList(list.head, 0);
		display(list.head);
		
		
		
//		list.addAtHead(10);
//		list.addAtTail(9);
//		list.addAtTail(8);
//		list.addAtTail(7);
//		list.addAtTail(6);
//		list.addAtTail(6);
//		list.addAtTail(7);
//		list.addAtTail(8);
//		list.addAtTail(9);
//		list.addAtTail(10);
//		list.addAtHead(8);
//		list.addAtTail(9);
//		list.addAtTail(1);
//		list.addAtTail(5);
//		list.addAtTail(3);
//		list.addAtTail(2);
//		list.addAtTail(6);
//		
//		list.display(list.head);
//		System.out.println();
//		Node tmp=list.head;
//		while(tmp.next!=null) 
//			tmp=tmp.next;                      //LOOP
//			tmp.next=head.next;
	
//			tmp=hasCycle(head);
//			System.out.println("\n"+tmp.data);
		
//		System.out.println(list.listPivoting(list.head, 6));
//		list.display(list.head);
		
		
//		list1.addAtHead(0);
//		
//		mergeList(list.head, list1.head);
//		System.out.println();
//		list.display(list1.head);
		
		
		
		
		
		
		
	}

}
