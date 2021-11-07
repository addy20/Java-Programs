import java.util.*;
public class NextPermutation {

	public static void main(String[] args) {
    List<Integer> L=new ArrayList<Integer>();
    
    Collections.addAll(L,6, 5, 4, 3, 2, 3, 2, 1, 0);
    System.out.println(nextPerm(L));
	}
	public static List <Integer> nextPerm(List<Integer> L){
		int n=L.size();
		int k=n-2;
		while(k>=0&&L.get(k)>=L.get(k+1))
		{
			k=k-1;
		}
		if (k==-1) {
			return Collections.emptyList();
			}
		for(int i=n-1;i>k;i++)
		{
			if(L.get(i)>L.get(k))
			{
				Collections.swap(L, i, k);
				break;
			}
		}
		Collections.sort(L.subList(k + 1,L.size()));
		return L;
		
	}

}
