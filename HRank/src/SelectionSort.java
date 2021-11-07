
public class SelectionSort {

	public static void main(String[] args)  {
    
		int []arr= {38,52,9,18,6,62,13};
		int n=arr.length;
		
		
		int actual[]=new int[n+1];
	     for(int i=0;i<arr.length;i++)
	     {
	         actual[i]=arr[i]^arr[i+1];
	     }
	     
	     for(int i=0;i<arr.length;i++)
	     {
	         System.out.println(actual[i]+" "); 
	     }
		
	}

}
