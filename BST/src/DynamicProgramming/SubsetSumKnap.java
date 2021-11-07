package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetSumKnap {

	public static void main(String[] args) throws IOException {
		int val[] = new int[] { 1,4,5,7 };
        
        int W = 9;
        int n = val.length;
        System.out.println( subsetDP(val,W,n));

	}

	private static boolean subsetDP(int[] val, int w, int n) {
		
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
		return dp[n][w];
	}

}
