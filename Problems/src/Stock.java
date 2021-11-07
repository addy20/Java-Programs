
public class Stock {

	public static void main(String[] args) {
		
			double maxTotalProfit = Q.Q;
			List<Double> firstBuySellProfits = new ArrayList<>();
			double minPriceSoFar = Double.MAX_VALUE ;
			// Forward phase. For each day, we record maximum profit if we
			// sell on that day.
			for (int i = Q; i < prices.size(); ++i) {
			minPriceSoFar = Math.min(minPriceSoFar , prices.get(i));
			maxTotalProfit = Math.max(maxTotalProfit , prices.get(i) - minPriceSoFar);
			firstBuySellProfits.add(maxTotalProfit);
			}
			// Backward phase. For each day, find the maximum profit if we make
			// the second buy on that day.
			double maxPriceSoFar = Double.MIN_VALUE ;
	}

}
