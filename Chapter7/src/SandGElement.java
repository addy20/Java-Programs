import java.util.*;
public class SandGElement {
	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<Integer>();
		obj.add(6);
		obj.add(5);
		obj.add(7);
		obj.add(9);
		obj.add(8);
		obj.add(2);
		obj.add(3);
		int max=obj.get(0);
		for(int i=1;i<obj.size();i++)
		{
		    int num=obj.get(i);
			if(num>max)
			{ 
				max=num;
			}
		}
		System.out.println("Maximum number is: "+max);
		
		int min=obj.get(0);
		for(int i=1;i<obj.size();i++)
		{
		    int num=obj.get(i);
			if(num<min)
			{ 
				min=num;
			}
		}
		System.out.println("Minimum no. is: "+min);
	}

}
