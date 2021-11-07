import java.util.*;
public class Multiply {

	public static void main(String[] args) {
    List<Integer> n1=new ArrayList<Integer>();
    List<Integer> n2=new ArrayList<Integer>();
    n1.add(-2);
    n1.add(1);
    n2.add(-3);
    n2.add(2);
    System.out.println(multiply(n1,n2));
	}
	public static List<Integer> multiply(List<Integer> n1,List<Integer> n2)
	{
		final int sign = n1.get(0)<0 ^ n2.get(0) < 0 ? -1 : 1;
		if(n1.get(0)<0) {
			n1.set(0, n1.get(0)*-1);
		}
		if(n2.get(0)<0)
		{			n2.set(0, n2.get(0)*-1);}
		n2.set (0 , Math . abs (n2 .get(0)));
		List<Integer> res=new ArrayList<Integer>(Collections.nCopies(n1.size()+n2.size(), 0));
		
		for(int i=n1.size()-1;i>=0;i--)
		{
			for(int j=n2.size()-1;j>=0;j--) 
			{
				res.set(i+j+1, res.get(i+j+1)+n1.get(i)*n2.get(j));
				res.set(i+j, res.get(i+j)+res.get(i+j+1)/10);
				res.set(i+j+1, res.get(i+j+1)%10);
			}
		}
		int first=0;
		while(res.get(first)==0)
		{
			first+=1;
		}
		res=res.subList(first, res.size());
		res.set(0 ,res.get(0)*sign);
		return res;
	}

}
