/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class x
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner ab=new Scanner(System.in);
     
     int t=ab.nextInt();
     while(t>0){
         int n=ab.nextInt();
         int sum=0,rev=0;
         while(n>0){
             int rem=n%10;
             sum=sum*10+rem;
             n=n/10;
         }
         System.out.println(sum);
         
     }
	}
}
