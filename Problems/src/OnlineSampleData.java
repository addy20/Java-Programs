import java.util.*;
public class OnlineSampleData {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Collections.addAll(list,1,2,3,4,5,6,7,8);
		int k=3;
		Iterator<Integer> it=list.iterator();
		
		System.out.println(RandomOnlineSample(it, k));
     
	}
	public static List<Integer> RandomOnlineSample(Iterator<Integer> it,int k) {
		List<Integer> res=new ArrayList<Integer>();
		int  n;
		for(int i=0;it.hasNext()&&i<k;i++)
		{
			res.add(it.next());
		}
		n=k;
		Random rn=new Random();
		while(it.hasNext()) {
			int x=it.next();
			n+=1;
			int r=rn.nextInt(n);
			if(r<k) {
				res.set(r,x);
			}
			
			
		}
		return res;
	}

}
