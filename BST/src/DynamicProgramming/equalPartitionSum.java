package DynamicProgramming;

public class equalPartitionSum {

	public static void main(String[] args) {
		int nums[] = {1,2,11,5};
		
		System.out.println(findSum(nums));

	}

	private static boolean findSum(int[] nums) {
		int n=nums.length;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=nums[i];
		}
		if(sum%2!=0) {
			return false;
		}else {
			return subsetSum(nums,sum/2,n);
		}
	}

	private static boolean subsetSum(int[] nums, int w,int n) {
		boolean dp[][]=new boolean[n+1][w+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<w+1;j++) {
				if(i==0) {
					dp[i][j]=false;
				}
				if(j==0) {
					dp[i][j]=true;
				}
			}
			
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(nums[i-1]>j) {
					dp[i][j]=dp[i-1][j];
				}else {
					dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];
				}
			}
		}
		return dp[n][w];
	}

}
