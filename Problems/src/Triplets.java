import java.util.Arrays;



public class Triplets {

	public static void main(String[] args) {
		int arr[]= {20,1,4,10,2};
		int n=40;
		
		findTriplets(arr,n);

	}

	private static void findTriplets(int[] arr,int n) {
		Arrays.sort(arr);
		int count=0;
		int x=arr.length-1;
		for(int i=0;i<x-2;i++) {
			if(helperClass(arr,n/arr[i], i+1)) {
				count++;
			}
		}
		System.out.println(count+" ");
		
	}
	
	public static boolean helperClass(int[] a,int n,int i){
		int j=a.length-1;
		while(i<j) {
			if(a[i]*a[j]>n){
				j--;
			}else if(a[i]*a[j]<n) {
				i++;
			}else {
				return true;
			}
			
		}
		return false;
	}

}
