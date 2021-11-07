import java.util.*;
public class SieveApproach {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter upto which you want prime numbers");
    int n=ab.nextInt();
    System.out.println(prime(n));
    System.out.println(prime1(n));
    System.out.println(prime2(n));
    System.out.println(prime3(n));
    
    
	}
	public static List<Integer> prime(int n) {
		List <Boolean> isPrimes=new ArrayList<Boolean>(Collections.nCopies(n+1,true));
		
		List <Integer> Primes=new ArrayList<Integer>();
		isPrimes.set(0,false);
		isPrimes.set(1,false);
		for(int i=2;i<=n;i++) 
		{
			if(isPrimes.get(i)==true)
			{
				Primes.add(i);
			    for(int j=i*i;j<=n;j=j+i)
			    {
				    isPrimes.set(j,false);
			    }
			}
			
		}
		System.out.println("Method 1 : ");
		return Primes;

	}
	public static List<Integer> prime1(int n)
	{
		List <Integer> Prime1=new ArrayList<Integer>();
		if(n==0||n==1) {
	    	  System.out.println("No Prime");
	      }
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
		        Prime1.add(i);
		      }	
	      }	
	      System.out.println("Method 2 : ");
	      return Prime1;
	}
	public static List<Integer> prime2(int n) {
		List <Boolean> isPrimes1=new ArrayList<Boolean>(Collections.nCopies(n+1,true));
		
		List <Integer> Primes2=new ArrayList<Integer>();
		isPrimes1.set(0,false);
		isPrimes1.set(1,false);
		for(int i=2;i<=n;i++) 
		{
			if(isPrimes1.get(i)==true)
			{
				Primes2.add(i);
			    for(int j=i;j<=n;j=j+i)
			    {
				    isPrimes1.set(j,false);
			    }
			}
			
		}
		System.out.println("Method 3 : ");
		return Primes2;

	}
	public static List<Integer> prime3(int n){
		int size=((n-3)/2)+1;
		List <Boolean> isPrimes=new ArrayList<Boolean>(Collections.nCopies(size+1,true));
		List <Integer> Primes=new ArrayList<Integer>();
		
		Primes.add(2);
		
		for(int i=0;i<size;i++) 
		{
			if(isPrimes.get(i)==true)
			{
				int p=2*i+3;
				Primes.add(p);
			    for(int j=(i*i)*2+(6*i)+3;j<size;j=j+p)
			    {
				    isPrimes.set(j,false);
			    }
			}
			
		}
		System.out.println("Method 4 : ");
		return Primes;
		
	}

}
