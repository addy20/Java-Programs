package Heaps;

import java.util.*;

public class MergeKSortedArrays {
public static List<Integer> mergeKSortedArrays(int a[][] ){
	List<Integer> res=new LinkedList();
	PriorityQueue<Integer> minHeap=new PriorityQueue<>();
	for(int i=0;i<a.length;i++) {
		for(int ele:a[i]) {
			minHeap.add(ele);
		}
	}
	Iterator<Integer> it=minHeap.iterator();
	while(it.hasNext()) {
		res.add(minHeap.remove());
	}
	return res;
}
	public static void main(String[] args) {
		int A[][]=new int[5][];
        A[0]=new int[] {1,5,8,9};
        A[1]=new int[] {2,3,7,10};
        A[2]=new int[] {4,6,11,15};
        A[3]=new int[] {9,14,16,19};
        A[4]=new int[] {2,4,6,9};
        
        System.out.println(mergeKSortedArrays(A));     
	
	}

}
