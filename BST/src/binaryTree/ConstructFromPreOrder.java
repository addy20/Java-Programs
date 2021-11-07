package binaryTree;
import java.util.*;

public class ConstructFromPreOrder {
	public static class Node{
		int data;
		Node left,right;
		Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	public static class Pair{
		Node node;
		int state;
		Pair(Node node,int state){
			this.node=node;
			this.state=state;
		}
	}
	public static void display(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.data);
		display(node.left);
		display(node.right);
	}
	public static int sum(Node node) {
		if(node==null) {
			return 0;
		}
		int totalsum=sum(node.left)+sum(node.right)+1;
		
		return totalsum;
	}
	public static int max(Node node) {
		if(node==null) {
			return Integer.MIN_VALUE;
		}
		int finalmax=Math.max(Math.max(max(node.left),max(node.right)),node.data);
		return finalmax;
	}
	public static List<Integer> preOrderTraversal(Node root){
		List<Integer> list=new ArrayList<>();
		if(root==null) {
			return list;
		}
		list.add(root.data);
		list.addAll(preOrderTraversal(root.left));
		list.addAll(preOrderTraversal(root.right));
		return list;
	}
   public static List<List<Integer>> levelOrder(Node root) {
       List<List<Integer>> list=new ArrayList<>();
       if(root==null) {
    	   return list;
       }
       
	   Queue<Node> mq=new ArrayDeque<>();
        mq.add(root);
        while(mq.size()>0) {
        	List<Integer> subList=new ArrayList<>();
        	int count=mq.size();
        	for(int i=0;i<count;i++) {
        		root=mq.remove();
        		subList.add(root.data);
        		if(root.left!=null) {
        			mq.add(root.left);
        		}
        		if(root.right!=null) {
        			mq.add(root.right);
        		}
        	}
        	list.add(subList);        	
        	
        }
        return list;
    }
   public static void iterativeTraversal(Node node) {
	   Stack<Pair> st=new Stack<>();
	   Pair root=new Pair(node,1);
	   st.push(root);
	   String in=" ",pre =" ",post=" ";
	   while(st.size()>0) {
		   Pair top=st.peek();
		   if(top.state==1) {//print ,state++,left
			   pre+=top.node.data+" ";
			   top.state++;
			   if(top.node.left!=null) {
				   Pair lp=new Pair(top.node.left,1);
				   st.push(lp);
			   }
			   
		   }else if(top.state==2) {
			   in+=top.node.data+" ";
			   top.state++;
			   if(top.node.right!=null) {
				   Pair rp=new Pair(top.node.right,1);
				   st.push(rp);
			   }
		   }else {
			   post+=top.node.data+" ";
			   st.pop();
			   
		   }
	   }
	   System.out.println(pre);
	   System.out.println(in);
	   System.out.println(post);
   }
//   static ArrayList<Integer> list=new ArrayList<>();
   static ArrayList<Node> list=new ArrayList<>();
   public static boolean find(Node node,int x) {
	   if(node==null) {
		   return false;
	   }
	   if(node.data==x || find(node.left,x) || find(node.right,x)) {
		   list.add(node);
		   return true;
	   }
	   return false;
   }
   public static void printKLevelDown(Node node,int k){
	   if(node==null || k<0) {
		   return;
	   }
	   if(k==0) {
		   System.out.println(node.data);
	   }
	printKLevelDown(node.left, k-1);
	printKLevelDown(node.right, k-1);
   }
   public static void printKLevelDown(Node node,int k,Node blocker,List<Integer> result){
	   if(node==null || k<0 ||node==blocker) {
		   return;
	   }
	   if(k==0) {
		   result.add(node.data);
	   }
	printKLevelDown(node.left, k-1,blocker,result);
	printKLevelDown(node.right, k-1,blocker,result);
   }
   public static void printKLevelFar(Node node,int data,int k) {
	   List<Integer> result=new ArrayList<>();
	   find(node,data);
	   for(int i=0;i<list.size();i++) {
		   printKLevelDown(list.get(i), k-i, i==0?null:list.get(i-1),result);
	   }
	   System.out.println(result);
   }
   public static void main(String[] args) {
		Integer[] arr= {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		Node root=new Node(arr[0],null,null);
		Pair rtp=new Pair(root,1);
		Stack<Pair> st=new Stack<>();
		st.push(rtp);
		int index=0;
		while(st.size()>0) {
			Pair top=st.peek();
			if(top.state==1) {
				index++;
				if(arr[index]!=null) 
				{
					top.node.left=new Node(arr[index],null,null);
					Pair lp=new Pair(top.node.left,1);
					st.push(lp);
				}else {
					top.node.left=null;
				}
				top.state++;
				
			}else if(top.state==2) {
				index++;
				if(arr[index]!=null) {
					top.node.right=new Node(arr[index],null,null);
					Pair rp=new Pair(top.node.right,1);
					st.push(rp); 
				}else {
					top.node.right=null;
				}
				top.state++;
				
			}else {
				st.pop();
			}
		}
//		System.out.println(preOrderTraversal(root));
		System.out.println(levelOrder(root));
//		iterativeTraversal(root);
//		printKLevelDown(root, 2);
		
		printKLevelFar(root,25,1);
		

	}

}
