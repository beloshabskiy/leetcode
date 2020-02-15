package leetcode.p121;

/**
 * 121. Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int lowestPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int current = prices[i];
            if (current < lowestPrice) {
                lowestPrice = current;
            } else if (current - lowestPrice > maxProfit) {
                maxProfit = current - lowestPrice;
            }
        }
        return maxProfit;
    }
}
