import java.util.*;
public class RandomPerm {

	public static void main(String[] args) {
        int n=4;
        randomPermutation(n);
	}
	public static void randomPermutation(int n)
	{
		List<Integer> L=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			L.add(i);
		}
		int k=n;
		offlineSampling(L,k);
	}
	public static void offlineSampling(List<Integer> L,int k)
	{
		Random R=new Random();
		int num;int n=L.size();
        for(int i=0;i<k;i++)
        {
          num=R.nextInt(n-i);
          Collections.swap(L, i, i+num);
        }
		System.out.println(L.subList(0, k));
	}
}
