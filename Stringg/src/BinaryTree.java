import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
	 Node root;
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree(); 
		tree.root=new Node('A');
		tree.root.left=new Node('B');
		tree.root.right=new Node('C');
		tree.root.left.left=new Node('D');
		tree.root.left.right=new Node('E');
		preOrderT(tree.root);
		System.out.println();
		inOrderT(tree.root);
		System.out.println();
		postOrderT(tree.root);
		System.out.println();
		System.out.println(BSTInOrder(tree.root));
		String str=null;
		System.out.println(str.valueOf(10));

	}
	public static void preOrderT(Node root) {
		if(root!=null) {
			System.out.print(root.data);
			preOrderT(root.left);
			preOrderT(root.right);
		}
	}
	public static void inOrderT(Node root) {
		if(root!=null) {
			inOrderT(root.left);
			System.out.print(root.data);
			inOrderT(root.right);
		}
	}
	public static void postOrderT(Node root) {
		if(root!=null) {
			postOrderT(root.left);
			postOrderT(root.right);
			System.out.print(root.data);
			
		}
	}
	public static List<Character> BSTInOrder(Node root){
		Deque<Node> stack=new LinkedList<>();
		Node curr=root;
		List<Character> res=new ArrayList<>();            //InOrder traversal without using recursion
		while(!stack.isEmpty()||curr!=null) {
			if(curr!=null) {
				stack.addFirst(curr);
				curr=curr.left;
			}else {
				curr=stack.removeFirst();
				res.add(curr.data);
				curr=curr.right;
				
			}
		}
		return res;
	}

}

