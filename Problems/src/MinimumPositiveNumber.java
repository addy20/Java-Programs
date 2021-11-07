import java.util.*;
public class MinimumPositiveNumber {

	public static void main(String[] args) {
    int arr[] = {0,-10,1,3,-20};
    List<Integer> L=new ArrayList<Integer>();
    for(int i:arr)
    {   if(i>0)
    	L.add(i);
    }
    System.out.println(L);
    Collections.sort(L);
    int max=Collections.max(L);
    int i;
    for(i=1;i<=max;i++)
    {    
    	if(!L.contains(i)) 
    	{
    		break;
    	}
    }
    System.out.println(i);
    System.out.println(find(arr));
    
	}
	public static int find(int[] arr) {
	    BitSet b = new BitSet();
	    for (int i : arr) {
	        if (i > 0) {
	            b.set(i);
	        }
	    }
	    return b.nextClearBit(1);
	}

}
