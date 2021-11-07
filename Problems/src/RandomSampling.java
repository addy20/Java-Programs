import java.util.*;
public class RandomSampling {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		List<Integer> L=new ArrayList<Integer>();
		Collections.addAll(L,5,7,3,11);
		int k=3;
		randomSampling(L,k);
	}
	public static void randomSampling(List<Integer> L,int k)
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
