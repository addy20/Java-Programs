import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
    System.out.println("Enter a Number");
    int num=ab.nextInt();
    int sum=0;
    int temp=num;
    while(num!=0)
    {
    	int rem=num%10;
    	sum=(sum*10)+rem;
    	num/=10;
    }
    if(temp==sum)
    	System.out.println("Palindrome");
    else
    	System.out.println("Not Palindrome");
	}

}
