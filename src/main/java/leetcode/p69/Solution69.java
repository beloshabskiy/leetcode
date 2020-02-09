package leetcode.p69;

public class Solution69 {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int low = 1;
        int high = x;

        while (high - low > 1) {
            int mid = (low + high) >>> 1;
            int midPow2 = mid * mid;
            if (midPow2 == x) {
                return mid;
            } else if (mid > Integer.MAX_VALUE / mid || midPow2 > x) {
                high = mid;
            } else {
                low = mid;
            }
        }

        if (high <= Integer.MAX_VALUE / high && x >= high * high) {
            return high;
        } else {
            return low;
        }
    }
}
