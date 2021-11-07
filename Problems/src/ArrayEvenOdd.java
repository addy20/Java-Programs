
public class ArrayEvenOdd {

	public static void main(String[] args) {
    int a[]= {3,6,2,7,9,10};
    
    int even=0;
	int odd=a.length-1;
	while(even<odd)
	{
		if(a[even]%2==0)
		{
				even++;
		}
		else {
			int temp=a[even];
			a[even]=a[odd];
			a[odd--]=temp;
			}}
    	
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
    
	
	
		}
	}


