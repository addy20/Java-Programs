package Temp;

public class occurancesCount {

	public static void main(String[] args) {
		
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		int N = 7, X = 2;
		
		System.out.println(binarySearch(arr, N, X));
		
		
	}
	
	public static int binarySearch(int arr[],int n,int x) {
		
		int start=0,end=n-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==x){
				return mid;
			}else if(arr[mid]<x) {
				start=mid+1;
			}else if(arr[mid]>x){
				end=mid-1;
			}
		}
		
		return -1;
		
	}

}
