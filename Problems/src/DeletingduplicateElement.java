import java.util.*;
public class DeletingduplicateElement {

	public static void main(String[] args) {
		List<Integer> A=new ArrayList<Integer>();
		Collections.addAll(A,2,3,5,5,7,11,11,11,13);
		System.out.println(delete(A));
		
		
		

	}
	public static List<Integer> delete(List<Integer> A) {
		
		int wi = 1;
		for (int i = 1; i < A.size(); ++i) 
		{
		  if (!A.get(wi-1).equals(A.get(i))) 
		  {
		    A.set(wi, A.get(i));
		    wi++;
		  }
		}
		for(int i=wi;i<A.size();i++) {
			A.set(i, 0);
		}
		return A;

}}
