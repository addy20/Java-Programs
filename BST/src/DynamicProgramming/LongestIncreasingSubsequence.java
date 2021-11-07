package DynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = {10, 9, 2, 5, 3, 7, 101, 18};
		
		int dp[]=new int[arr.length];
        dp[0]=arr[0];
        int len=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>dp[len]) {
				dp[++len]=arr[i];
			}else {
				int pos=binarySearch(dp,arr[i],len);
				dp[pos]=arr[i];
			}
		}
		System.out.println(len+1);
		
		
	}
	public static int binarySearch(int arr[],int x,int len) {
		int left=0;
		
		while(left<=len) {
			int mid=left+(len-left)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>x) {
				len=mid-1;
			}else {
				left=mid+1;
			}
		}
		return left;
		
	}
	

}
