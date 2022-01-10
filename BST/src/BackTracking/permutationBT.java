package BackTracking;

import java.util.*;

public class permutationBT {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println(subsetGen(a));
	}
	
	public static List<List<Integer>> subsetGen(int []a){
		List<List<Integer>> output=new ArrayList<>();
		backtrack(a,new ArrayList<>(), output);
		return output;
	}
	

	public static void backtrack(int[] a,List<Integer> list,List<List<Integer>> output) {
		
		if(list.size()==a.length)
			output.add(new ArrayList<>(list));
		else {
		for(int i=0;i<a.length;i++) {
			if(list.contains(a[i]))
				continue;
			list.add(a[i]);
		    backtrack(a,list,output);
		    list.remove(list.size()-1);
		}
	}
		}

}
