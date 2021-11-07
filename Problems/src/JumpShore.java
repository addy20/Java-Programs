/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class JumpShore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ab=new Scanner(System.in);
		int T=ab.nextInt();
		for(int i=0;i<T;i++)
		{
		    int x=ab.nextInt();
		    int y=ab.nextInt();
		    int xi=ab.nextInt();
		    int yi=ab.nextInt();
		    int D=ab.nextInt();
		     double min=Math.min(x/(double)xi, y/(double)yi);
		     if(min>=D) {
		    	 System.out.println("YES");    	 
		     }
		     else
		    	 System.out.println("NO");
		}
		
	}
}
