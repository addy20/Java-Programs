import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int n=ab.nextInt();
		int num[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			num[i]=ab.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			while(num[i]!=0) 
			{
			sum=sum+(num[i]%10);
			num[i]/=10;
			}
			System.out.println(sum);
			
		}
		
    
	}

}
