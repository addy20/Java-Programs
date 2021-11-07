package Heaps;
import java.util.*;
public class sortApproxSortedArray {
	public static List<Integer> sort(int k,List<Integer> list)
	{
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		List<Integer> res=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			minHeap.add(list.get(i));
			if(i>(k-1))
				res.add(minHeap.remove());			
		}
		while(!minHeap.isEmpty())
			res.add(minHeap.remove());
		
		return res;
	}

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Collections.addAll(list, 3,-1,2,6,4,5,8);
		System.out.println(sort(3, list));

	}

}
