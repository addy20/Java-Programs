package DynamicProgramming;

public class minimumSubsetSumDifference {

	public static void main(String[] args) {
		int arr[] = { 1,2,7,1,6 };
        int n = arr.length;
        System.out.print("The minimum difference"
                         + " between two sets is "
                         + findMin(arr, n));

	}
   private static int findMin(int[] arr, int n) {
		int tot_sum=0;
		for(int i=0;i<arr.length;i++) {
			tot_sum+=arr[i];
		}
		
		return subsetDP(arr, tot_sum, n);
	}
  private static int subsetDP(int[] val, int w, int n) {
		
		boolean dp[][]=new boolean[n+1][w+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				if(i==0) {
					dp[i][j]=false;
				}
				if(j==0) {
					dp[i][j]=true;
				}
			}
		}
		for(int i = 1; i < n + 1; i++) {  
	        for(int j = 1; j < w + 1; j++) {
	        	if(val[i-1]>j) {
	        		dp[i][j]=dp[i-1][j];
	        	}else {
	        		dp[i][j]=dp[i-1][j-val[i-1]] || dp[i-1][j];
	        	}
	        }
	    }
		int min=Integer.MAX_VALUE;
		for(int i=0;i<=w/2;i++) {
			if(dp[n][i]==true) {
				min=Math.min((w-2*i), min);
			}
		}
		return min;
	}

}
