package pack;

import java.util.StringTokenizer;

public class a2 {

	public static void main(String[] args)
	
	{
       StringTokenizer st=new StringTokenizer("Hello,World|of|Java",",|",false);
       while(st.hasMoreTokens())
           
    	   System.out.println("Token :"+st.nextElement());
       
	}
	}