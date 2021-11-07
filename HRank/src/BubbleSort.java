import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
    Scanner ab=new Scanner(System.in);
	System.out.println("Enter the number of integer");
	int n=ab.nextInt();
    int [] array=new int[n];
    for(int i=0;i<array.length;i++)
    {
    	array[i]=ab.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
    	boolean sort=true;
    	for(int j=0;j<n-1-i;j++)
    	{
    		if(array[j+1]<array[j])
    		{
    			int temp=array[j+1];
    			array[j+1]=array[j];
    			array[j]=temp;
    			sort=false;
    		}
    	}
    	if(sort)
    	{
    		break;
    	}
    }
    for(int e:array)
    {
    	System.out.println(e+" ");
    }
	}

}
