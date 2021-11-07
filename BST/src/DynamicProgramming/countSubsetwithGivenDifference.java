package DynamicProgramming;

public class countSubsetwithGivenDifference {

	public static void main(String[] args) {
		int arr[] = { 1,1,2,3 };
		int diff=1;
        int n = arr.length;
        System.out.print("Total number of subsets with given difference is "
                         + countDiff(arr,diff,n));
	}

	private static int countDiff(int[] arr, int n,int diff) {
		
		int tot_sum=0;
		for(int i=0;i<arr.length;i++) {
			tot_sum+=arr[i];
		}
		int s1=(diff+tot_sum)/2;
		
		return countOfsubsetDP(arr,s1,n);
	}

private static int countOfsubsetDP(int[] val, int w, int n) {
		
		int dp[][]=new int[n+1][w+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				if(i==0) {
					dp[i][j]=0;
				}
				if(j==0) {
					dp[i][j]=1;
				}
			}
		}
		for(int i = 1; i < n + 1; i++) {  
	        for(int j = 1; j < w + 1; j++) {
	        	if(val[i-1]>j) {
	        		dp[i][j]=dp[i-1][j];
	        	}else {
	        		dp[i][j]=dp[i-1][j-val[i-1]] + dp[i-1][j];
	        	}
	        }
	    }
		return dp[n][w];
	}

}
