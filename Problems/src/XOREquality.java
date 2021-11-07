import java.util.*;
import java.io.*;
public class XOREquality {

	public static void main(String[] args) throws java.lang.Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(br.readLine());
    while(T-->0)
    {
    	int N=Integer.parseInt(br.readLine());
    	long m= 1000000007;
    	System.out.println(power(2,N-1,m));
    }
	}
	static int power(long x,int y,long m)
	  {
		long res = 1;
	    x = x % m; 
	    if (x == 0)
	      return 0; 
	 
	    while (y > 0)
	    {
	      if ((y & 1) != 0)
	      res = (res * x) % m;
	      y = y >> 1; 
	      x = (x * x) % m;
	    }
	    return (int) res;
	  }

}
