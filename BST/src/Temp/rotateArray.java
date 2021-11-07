package Temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      
	      int t=sc.nextInt();
	      while(t--!=0)
			{
			    int n=sc.nextInt();
			    int d=sc.nextInt();
			    int[] arr=new int[n];
			   List<Integer> list=new ArrayList<>();
			    for(int i=0;i<n;i++){
			        arr[i]=sc.nextInt();
			    }
			    
			    for(int i=d;i<n;i++) {
			    	list.add(arr[i]);
			    }
			    for(int i=0;i<d;i++) {
			    	list.add(arr[i]);
			    }
			    System.out.println(list);
			    
			    
			    
			}
	}

}
