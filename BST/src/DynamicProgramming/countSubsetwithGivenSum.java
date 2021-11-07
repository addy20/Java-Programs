package DynamicProgramming;

public class countSubsetwithGivenSum {

	public static void main(String[] args) {
        int val[] = new int[] { 1,4,5,7,3,6 };
        int W = 9;
        int n = val.length;
        System.out.println( countOfsubsetDP(val, W, n));

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
