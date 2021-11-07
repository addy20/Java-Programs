
public class ListPalindromicity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isLinkedListAPalindrome (Node <Integer> L) {
		if (L == null) {
		   return true ;
		}
		Node<Integer> slow=L, fast=L;
		while (fast!=null && fast.next!=null)
		{
			fast = fast.next.next ;
			slow = slow.next ;
		}
		Node<Integer> firstHalfIter = L;
		Node <Integer> secondHalfIter = ReverseLinkedListIterative.reverseLinkedList(slow);
		while (secondHalfIter != null && firstHalfIter != null) {
		if (secondHalfIter.data != firstHalfIter.data) {
		return false ;
		}
		secondHalfIter = secondHalfIter.next ;
		firstHalfIter = firstHalfIter.next ;
		}
		return true ;

 } 
	}
