package leetcode.p860;

/**
 * 860. Lemonade Change
 * At a lemonade stand, each lemonade costs $5.
 * Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
 * You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
 * Note that you don't have any change in hand at first.
 * Return true if and only if you can provide every customer with correct change.
 */
public class Solution860 {

    public boolean lemonadeChange(int[] bills) {
        int bills5 = 0;
        int bills10 = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5:
                    ++bills5;
                    break;
                case 10:
                    --bills5;
                    ++bills10;
                    break;
                case 20:
                    if (bills10 > 0) {
                        --bills10;
                        --bills5;
                    } else {
                        bills5 -= 3;
                    }
            }
            if (bills5 < 0) {
                return false;
            }
        }
        return true;
    }
}
