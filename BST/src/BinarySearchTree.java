import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	Node root;
public static  Node searchKey(Node root,int key) {
	if(root==null||root.data==key) {
		return root;
	}
	return key>root.data ? searchKey(root.right,key):
		                   searchKey(root.left,key);
	
}
public void insert(int key) {
	root=insertRec(root,key);
}
public Node insertRec(Node root,int key) {
	if(root==null) {
		root=new Node(key);
		return root;
	}
	if(key<root.data) {
		root.left=insertRec(root.left, key);
	}else if(key>root.data) {
		root.right=insertRec(root.right, key);
	}
	return root;
}
public static void inOrderT(Node root) {
	if(root!=null) {
		inOrderT(root.left);
		System.out.print(root.data+" ");
		inOrderT(root.right);
	}
}
public static boolean isBinaryTreeBST(Node root){
     return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
private static boolean isBST(Node root,Integer lower, Integer upper) {
     if (root == null) {
		return true ;
	 }else if (lower>root.data||root.data>upper){
		return false;
	 }
		
     return isBST(root.left,lower,root.data)&&isBST(root.right,root.data,upper);
}
public static Node findFirstGreaterThanK(Node root,int k) {
	Node node=root;Node ans=null;
	while(node!=null) {
		if(k<node.data) {
			ans=node;
			node=node.left;
		}else {
			node=node.right;
		}
	}
	return ans;
}
public static List<Integer> findKLargestlnBST(Node tree, int k){
List <Integer> kLargestElements = new ArrayList <>();
findKLargestlnBSTHelper(tree , k, kLargestElements);
return kLargestElements;
}

	private static void findKLargestlnBSTHelper(Node tree, int k, List<Integer> kLargestElements) {
	
	
 }
	public static Node delete(Node root,int key) {
		if(root==null) {
			return root;
		}
		if(key<root.data) {
			root.left=delete(root.left,key);
		}else if(key>root.data) {
			root.right=delete(root.right,key);
		}else {
			if(root.left==null&&root.right==null) {
				return null;
			}else if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}else {
				Node min=min(root.right);
				root.data=min.data;
				root.right=delete(root.right,key);
			}
		}
		return root;
	}
	
	private static Node min(Node root) {
		if(root==null) {
			return root;
		}
		return min(root.left);
		
	}
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		int a[]= {50,15,62,5,20,58,91,3,8,37,60,24};
		for(int i=0;i<a.length;i++) {
			tree.insert(a[i]);
		}
		System.out.println("InOrder Traversal");
		inOrderT(tree.root);
//		System.out.println("\n"+isBinaryTreeBST(tree.root));
		System.out.println();
		delete(tree.root,8);
		inOrderT(tree.root);
		
		
		
	}

}
