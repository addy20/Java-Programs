/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sqrt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ab=new Scanner(System.in);
		int t=ab.nextInt();
		
		for(int i=0;i<t;i++)
		{   
		    List<Integer> L=new ArrayList<Integer>();
		    L.add(ab.nextInt());
		    L.add(ab.nextInt());
		    L.add(ab.nextInt());
		    Collections.sort(L);
		    System.out.println(L.get(1));
		    L.clear();
		}
	}
}
