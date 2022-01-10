package BackTracking;

import java.util.*;

public class subsetBT {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println(subsetGen(a));
	}
	
	public static List<List<Integer>> subsetGen(int []a){
		List<List<Integer>> output=new ArrayList<>();
		backtrack(a, 0,new ArrayList<>(), output);
		output.add(new ArrayList<>());
		return output;
	}
	

	public static void backtrack(int[] a,int start,List<Integer> list,List<List<Integer>> output) {
		
		for(int i=start;i<a.length;i++) {
			list.add(a[i]);
			output.add(new ArrayList<>(list));
		    backtrack(a,i+1,list,output);
		    list.remove(list.size()-1);
		}
	}

}
