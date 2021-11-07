import java.util.*;

public class BinaryTreee {
	Node root;
	static class BalanceStatusWithHeight{
		boolean balanced;
		int height;
		public BalanceStatusWithHeight(boolean balanced,int height) {
			this.balanced=balanced;
			this.height=height;
		}
	}
	public static boolean isBalanced(Node tree) {
		return checkBalanced(tree).balanced;
		}
	public static BalanceStatusWithHeight checkBalanced(Node tree) 
	{
		if (tree == null){
			// Base case.
			return new BalanceStatusWithHeight(true,-1); 
		}
		BalanceStatusWithHeight leftResult = checkBalanced(tree.left);
		if (!leftResult.balanced){
			// Left subtree is not balanced.
			return leftResult; 
		}
		BalanceStatusWithHeight rightResult = checkBalanced(tree.right);
		if (!rightResult.balanced){
			// Right subtree is not balanced.
			return rightResult; 
		}
		boolean isBalanced=Math.abs(leftResult.height-rightResult.height)<=1;
		int height =Math.max(leftResult.height,rightResult.height)+1;
		    return new BalanceStatusWithHeight(isBalanced,height);
	}
	public static boolean isSymmetric(Node tree) {
		return checkSymmetric(tree.left,tree.right);
	}
	

	private static boolean checkSymmetric(Node subtree0, Node subtree1) {
		if(subtree0==null&&subtree1==null) {
			return true;
		}else if(subtree0!=null&&subtree1!=null&&subtree0.data==subtree1.data){
			return checkSymmetric(subtree0.left, subtree1.right)&&checkSymmetric(subtree0.right, subtree1.left);
			
		}
		return false;
	}
	public static int sumRootLeaf(Node tree) {
		return sumRootLeafHelper(tree,0);
	}
	private static int sumRootLeafHelper(Node root, int sum) {
		if(root==null)
		return 0;
		sum=(2*sum)+root.data;           //Binary sum
		if(root.left==null&&root.right==null) {
			return sum;
		}
		return sumRootLeafHelper(root.left, sum)+sumRootLeafHelper(root.right, sum);
	}
	public static boolean hasPathSum(Node tree,int targetSum) {
		return hasPathSumHelper(tree,0,targetSum);
	}
	private static boolean hasPathSumHelper(Node root,int sum,int k) {
		if(root==null)
			return false;
		sum=sum+root.data;
		if(root.left==null&&root.right==null) {
			return sum==k;
		}
		return hasPathSumHelper(root.left, sum,k)||hasPathSumHelper(root.right, sum,k);
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
	
	public static void main(String[] args){
		
			BinaryTreee tree=new BinaryTreee();
			tree.root=new Node('A');
			tree.root.left=new Node('B');
			tree.root.right=new Node('C');
			tree.root.left.left=new Node('D');
			tree.root.left.right=new Node('E');
			tree.root.right.left=new Node('F');
			tree.root.right.right=new Node('G');
			System.out.println(BSTInOrder(tree.root));	
    
	}

}
