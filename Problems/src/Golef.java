import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Golef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	 
	        
	        int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++)
		{
			StringTokenizer st
	        = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
		    int x=Integer.parseInt(st.nextToken());
		    int k=Integer.parseInt(st.nextToken());
		    if(x%k==0)
		    {
		    	System.out.println("YES");
		    }else if(((N+1)-x)%k==0)
		    {
		    	System.out.println("YES");
		    }else
		    	System.out.println("NO");
		    
		}
	}
}
