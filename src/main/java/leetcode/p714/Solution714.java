package leetcode.p714;

/**
 * 714. Best Time to Buy and Sell Stock with Transaction Fee
 * Your are given an array of integers prices, for which the i-th element is the price of a given stock on day i;
 * and a non-negative integer fee representing a transaction fee.
 * You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.
 * You may not buy more than 1 share of a stock at a time (ie. you must sell the stock share before you buy again.)
 * Return the maximum profit you can make.
 */
public class Solution714 {

    public int maxProfit(int[] prices, int fee) {
        if (prices.length < 2) {
            return 0;
        }

        int profit = 0;
        int buy = prices[0];
        int possibleSell = -1;

        for (int i = 1; i < prices.length; i++) {
            if (isLocalMinimum(i, prices)) {
                if (possibleSell != -1 && possibleSell - prices[i] > fee) {
                    profit += (possibleSell - buy - fee);
                    possibleSell = -1;
                    buy = prices[i];
                } else if (buy > prices[i]) {
                    possibleSell = -1;
                    buy = prices[i];
                }
            } else if (isLocalMaximum(i, prices)) {
                if (buy != -1 && (prices[i] - buy > fee) && prices[i] > possibleSell) {
                    possibleSell = prices[i];
                }
            }
        }

        if (possibleSell != -1) {
            profit += (possibleSell - buy - fee);
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
