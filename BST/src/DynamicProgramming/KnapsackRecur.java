package DynamicProgramming;

public class KnapsackRecur {

	public static void main(String[] args) {
		int val[] = new int[] { 1,4,5,7 };
        int wt[] = new int[] { 1,3,4,5 };
        int W = 7;
        int n = val.length;
       System.out.println( knapSackDP(W, wt, val, n));

	}

	private static int knapSackRec(int w, int[] wt, int[] val, int n,int[][]dp) {
		if(w==0 || n==0) {
			return 0;
		}
		if (dp[n][w] != -1)
	        return dp[n][w]; 
		
		if(wt[n-1]>w) {
			return dp[n][w] = knapSackRec(w, wt, val, n-1,dp);
		}else {
			return dp[n][w] = Math.max(val[n-1] + knapSackRec(w-wt[n-1], wt, val, n-1,dp),knapSackRec(w, wt, val, n-1,dp));
		}
		
	}
	
	static void knapSack(int W, int wt[], int val[], int N)
	{ 
	     
	    // Declare the table dynamically
	    int dp[][] = new int[N + 1][W + 1];
	     
	    // Loop to initially filled the
	    // table with -1
	    for(int i = 0; i < N + 1; i++)  
	        for(int j = 0; j < W + 1; j++)  
	            dp[i][j] = -1;   
	     
	    System.out.println(knapSackRec(W, wt, val, N, dp));
	    
	}
	private static int knapSackDP(int w, int[] wt, int[] val, int n) {
		int dp[][]=new int[n+1][w+1];
		for(int i = 0; i < n + 1; i++) {  
	        for(int j = 0; j < w + 1; j++) { 
	        	if(i==0 || j==0) {
	    			dp[i][j]=0;
	    		}
	        	else if(wt[i-1]>j) {
	    			 dp[i][j] = dp[i-1][j];
	    		}else {
	    			 dp[i][j] =Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
	    		}
	        	
	        }
	        
	        }
		return dp[n][w];
		
		
		
		
		
		
	}

}
