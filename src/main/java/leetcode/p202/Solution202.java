package leetcode.p202;

public class Solution202 {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumDigitSquares(slow);
            fast = sumDigitSquares(sumDigitSquares(fast));

            if (slow == 1 || fast == 1) {
                return true;
            } else if (slow == fast) {
                return false;
            }
        } while (true);
    }

    private static int sumDigitSquares(int n) {
        int result = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            result += (lastDigit * lastDigit);
            n /= 10;
        }

        return result;
    }
}
