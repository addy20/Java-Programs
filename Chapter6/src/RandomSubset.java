import java.util.*;
public class RandomSubset {

	public static void main(String[] args) {
		System.out.println(randomSubset(100,4));
    
	}
	public static List<Integer> randomSubset(int n,int k){
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		Random R=new Random();
		for(int i=0;i<k;i++) {
			
			int randomIndex=i+R.nextInt(n-i);
			Integer p1=m.get(randomIndex);
			Integer p2=m.get(i);
			if(p1==null && p2==null)
			{
				m.put(randomIndex,i);
				m.put(i,randomIndex);
			}else if(p1==null&&p2!=null)
			{
				m.put(randomIndex,p2);
				m.put(i,randomIndex);
			}else if(p1!=null&&p2==null)
			{
				m.put(i,p1);
				m.put(randomIndex,p2);
			}else {
				m.put(i , p1);
				m.put(randomIndex,p2);
			}
		}
		List<Integer> result = new ArrayList();
		for (int i=0;i<k;i++) 
        {
		result.add(m.get(i));
		}
		return result ;
		
	}

}
