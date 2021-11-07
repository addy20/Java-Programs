package DynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int i=0;int j=0;
	    
	    System.out.println("Longest Common Subsequence is = "+lcs(X, Y, i, j));
	    System.out.println("Longest Common Subsequence is = "+lcsDP(s1,s2));
	    

	}
	public static int lcs(char[] X,char[] Y,int i,int j) {
		if(i==X.length || j==Y.length) {
			return 0;
		}else if(X[i]==Y[j]) {
			return 1+lcs(X,Y,i+1,j+1);
		}else {
			return Math.max(lcs(X,Y,i+1,j), lcs(X,Y,i,j+1));
		}
		
		
	}
	public static int lcsDP(char[] X,char[] Y) {
		int L[][] = new int[X.length+2][Y.length+2];
		for(int i=0;i<=X.length;i++) {
			for(int j=0;j<=Y.length;j++) {
				if(i==0 || j==0) {
					L[i][j]=0;
				}else if(X[i-1]==Y[j-1]) {
					L[i][j]=1+L[i-1][j-1];
				}else {
					L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
				}
			}
		}
		for(int i=0;i<L.length;i++) {
			for(int j=0;j<L.length;j++) {
				System.out.print(L[i][j]+" ");
			}
			System.out.println();
		}
		
		return L[X.length][Y.length];
	}
	public static int lcsDP(String s,String t) {
		int L[][] = new int[s.length()+1][t.length()+1];
		for(int i=1;i<=s.length();i++) {
			for(int j=1;j<=t.length();j++) {
			    if(s.charAt(i-1)==t.charAt(j-1)) {
					L[i][j]=1+L[i-1][j-1];
				}else {
					L[i][j]=max(L[i-1][j],L[i][j-1]);
				}
			}
		}
		String x ="";
		int i=s.length(),j=t.length();
        while(i>0 && j>0){
            if(s.charAt(i-1)==t.charAt(j-1)){
                x+=s.charAt(i-1);   
                i--;j--;
            }
            else{
                if(L[i][j-1]>L[i-1][j])j--;    
                else i--;
            }
        }
        System.out.println(x);
		return L[s.length()][t.length()];
	}
	public static int max(int a, int b)
	{
	    return (a > b)? a : b;
	}

}
