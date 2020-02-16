package leetcode.p122;

/**
 * 122. Best Time to Buy and Sell Stock II
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time
 * (i.e., you must sell the stock before you buy again).
 */
public class Solution122 {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (isLocalMinimum(i, prices)) {
                buy = prices[i];
            } else if (buy != -1 && isLocalMaximum(i, prices)) {
                profit += (prices[i] - buy);
                buy = -1;
            }
        }
        return profit;
    }


    private boolean isLocalMinimum(int i, int[] prices) {
        if (i == 0 && prices[1] > prices[0]) {
            return true;
        } else if (i == prices.length - 1 & prices[i] <= prices[i - 1]) {
            return true;
        } else if (prices[i] <= prices[i - 1] && prices[i] <= prices[i + 1]) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isLocalMaximum(int i, int[] prices) {
        if (i == 0 && prices[1] < prices[0]) {
            return true;
        } else if (i == prices.length - 1 & prices[i] >= prices[i - 1]) {
            return true;
        } else if (prices[i] >= prices[i - 1] && prices[i] >= prices[i + 1]) {
            return true;
        } else {
            return false;
        }
    }
}
