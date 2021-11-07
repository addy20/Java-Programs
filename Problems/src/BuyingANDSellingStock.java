import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuyingANDSellingStock {

	public static void main(String[] args) {
		List<Integer> A=new ArrayList<Integer>();
		Collections.addAll(A,10, 22, 5, 75, 65, 80);
		
		System.out.println("Total maxProfit = "+profitcalc(A));
		
	}
	public static int profitcalc(List<Integer> A){
		
		List<Integer> minimum=new ArrayList<Integer>();
		List<Integer> profit=new ArrayList<Integer>();
		int minPrice = Integer.MAX_VALUE , maxProfit = 0;
		for (int i = 0; i < A.size(); ++i) 
		{
			minPrice = Math.min(minPrice , A.get(i));
			maxProfit = Math.max(maxProfit , A.get(i) -minPrice);
			profit.add(maxProfit);
			minimum.add(minPrice);
	    }
		int n=A.size();
		List<Integer> BProfit=new ArrayList<Integer>(Collections.nCopies(n, 0));
		List<Integer> MProfit=new ArrayList<Integer>(Collections.nCopies(n, 0));
		int maxPrice=Integer.MIN_VALUE;int maxProf=0;
		for (int i = A.size()-1; i>0; --i) {
			maxPrice = Math.max(maxPrice,A.get(i));
			maxProf= Math.max(maxProf , maxPrice-A.get(i));
			BProfit.set(i, maxProf);
			MProfit.set(i, maxProf+profit.get(i-1));
	   }
		System.out.println("Minimum Price"+minimum);
		System.out.println("Forward Maximum Profit "+profit);
		System.out.println("Backward Maximum Profit "+BProfit);
		System.out.println("List of Total maxProfit "+MProfit);
		return Collections.max(MProfit);
	}

}
