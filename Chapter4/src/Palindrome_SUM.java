
import java.util.*;
public class Palindrome_SUM {

	public static void main(String[] args)
	{
      Scanner ab=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=ab.nextInt();
      revAndAdd(num);
	}
	static void revAndAdd(int n)
	{
		if(isPallindrome(n))
		{
			System.out.println("The Number is already Pallindrome");
		}
			else
			{
			    while(!isPallindrome(n))
			    {
				   int reverse=rev(n);
				   int sum=n+reverse;
				   System.out.println(n+" + "+reverse+" = "+sum);
				   n=sum;
			    }
		    }
	}
    static boolean isPallindrome(int n) 
	{
		int reverse = rev(n);
		if(reverse==n)
			{return true;}
		else
			{return false;}
	}
	static int rev(int n){
		int reverse=0;
		int rem=0;
		while(n!=0)
		    {  
			    rem=n%10;
		        reverse=(reverse*10)+rem;
		    	n/=10;
		    }
		return reverse;
	}
	

}
