import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



    



public class Solution1 {
    public static void main(String[] args){
       int n=3;
       List<Integer> arr=new ArrayList<Integer>();
       Collections.addAll(arr,
    		   
    		   1,2,2);
       System.out.println(candies(arr.size(),arr));
    }
    public static long candies(int n, List<Integer> arr) {
        List<Integer> ans=new ArrayList<Integer>(Collections.nCopies(n,1));   
        for(int i=1;i<n;i++)
        {
            if(arr.get(i)>arr.get(i-1))
            {
                ans.set(i,ans.get(i-1)+1);
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            if(arr.get(i)>arr.get(i+1))
            {
                ans.set(i,Math.max(ans.get(i+1)+1,ans.get(i)));
            }
        }
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+ans.get(i);
        }
        System.out.println(ans);
        return sum;
     

        }
}
