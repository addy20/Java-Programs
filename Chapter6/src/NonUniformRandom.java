import java.util.*;

public class NonUniformRandom {

	public static void main(String[] args) {
		List<Integer> L=new ArrayList<Integer>();
		List<Double> Prob=new ArrayList<Double>();
		
		System.out.println(nonuniformRandom(L, Prob));
    
	}
	public static int nonuniformRandom(List<Integer> L,List<Double> Prob) {
		List<Double> sumProb=new ArrayList<Double>();
		sumProb.add(0.0);
		for(double p:Prob)
		{
			sumProb.add(sumProb.get(sumProb.size()-1)+p);
		}
		Random r=new Random();
		double rn=r.nextDouble();
		int index=Collections.binarySearch(sumProb,rn);
		if(index<0)
		{
			int CI=Math.abs(index)-2;
			return L.get(CI);
		}else
			return L.get(index);
	}

}
