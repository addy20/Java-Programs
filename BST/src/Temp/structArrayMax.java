package Temp;

import java.util.ArrayList;
import java.util.List;

public class structArrayMax {
	
	class Height {
		int feet;
		int inches;
		public Height(int ft, int inc)
		{
		    feet = ft;
		    inches = inc;
		}
	}

	public static void main(String[] args) {
		int m=3;
		int i=0;
		if(m==i||m==++i||m==++i||m==++i||m==++i||m==++i||m==++i) {
			System.out.println(i);
		}
		
		
		

	}
	public static int findMax(Height arr[], int n)
    {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           int val=(arr[i].feet*12)+arr[i].inches;
           max=Math.max(val, max);
       }
       
       return max;
    }

}
