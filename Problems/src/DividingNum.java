/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DividingNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ab=new Scanner(System.in);
		int T=ab.nextInt();
		while(T-->0)
		{
		    int a=ab.nextInt();
		    String s=Integer.toString(a);
		    int f=Integer.parseInt(s.valueOf(0));
		    int l=Integer.parseInt(s,s.length());
		    System.out.println(f+l);
		    
		}
	}
}
