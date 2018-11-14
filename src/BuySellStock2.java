
public class BuySellStock2 {
	public int maxProfit(int[] prices) {
		int profit = 0, temp = 0, len = prices.length;
		while(temp < len) {
			while(temp < len - 1 && prices[temp+1] <= prices[temp])
				temp++;
			int min = prices[temp++];
			while(temp < len - 1 && prices[temp+1] >= prices[temp])	// find next local maximum
				temp++;
			profit += temp < len ? prices[temp++]-min : 0;
		}
		return profit;
	}
}
