import java.util.*;
public class cyclicRotateByK {
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int N=ab.nextInt();
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=ab.nextInt();
		}
		int result[]=optimisedMethod(arr, 2);
//	        int k = ab.nextInt();       
//	        for(int i=0;i<=k;i++) {///////////////////Brute force approach
//	        	int j,first=arr[0];
//	        	for(j=0;j<arr.length-1;j++){   //40,50,10,20,30
//	        		arr[j]=arr[j+1];
//	        	}
//	        	arr[j]=first;
//	        }    
	        for(int i = 0; i< result.length;i++){  
	            System.out.print(result[i] + " ");  
	        }  
	    }
	public static int[] optimisedMethod(int[] arr,int k){
		int n=arr.length;
		if(k>n) {
			k=k%n;
		}                         ///OPTIMISED APPROACH O(N)TC
		                                     //O(1) SC
		
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
		
		return arr;
		
		
	}
	public static void reverse(int[] arr,int start,int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	

	}


