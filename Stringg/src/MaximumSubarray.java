import java.util.*;
public class MaximumSubarray {

	public static void main(String[] args) {
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		long initial=System.currentTimeMillis();
		System.out.println(maxSubArray(a));
		long finalT=System.currentTimeMillis();
		System.out.println(initial+" "+finalT);
		System.out.println(lengthOfLastWord("Hello World"));
	}

	private static int maxSubArray(int[] a) {
		//Kadane's Algorithm
		int max=a[0],sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(sum>max) {
				max=sum;
			}
			if(sum<0) {
				sum=0;
			}
			
		}
		return max;
	}
	 public static int lengthOfLastWord(String s) {
	           	
	        
	    }
	

}
