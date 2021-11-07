import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      List <Integer> list=new ArrayList<Integer>();
	      System.out.println("Enter the value of n:");
	      int n = sc.nextInt();
	      
	      
	      for (int i = 2; i<=n; i++)  	   
	      { 		 		  
	         int flag=0; 		  
	         for(int j =2; j<=Math.sqrt(i); j++)
	         {
		    if(i%j==0)
		    {
			flag = 1;
		    }
		 }
		 if (flag ==0)
		 {
		    list.add(i);
		 }	
	      }
	      if(n==0||n==1) {
	    	  System.out.println("No Prime");
	      }else {
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(list);}
    
	}

}
