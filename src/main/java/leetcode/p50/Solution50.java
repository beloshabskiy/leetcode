package leetcode.p50;

import java.util.LinkedList;

public class Solution50 {

    public static double myPow(double x, int n) {
        double result = n > 0 ? x : 1 / x;
        final long targetN = Math.abs((long) n);
        long currentN = 1;
        LinkedList<CalculatedPow> alreadyCalculated = new LinkedList<>();
        alreadyCalculated.push(new CalculatedPow(1, result));

        while (currentN <= targetN / 2) {
            result *= result;
            if (result == 0.0 || result == -0.0) {
                return result;
            }
            currentN *= 2;
            alreadyCalculated.push(new CalculatedPow(currentN, result));
        }

        while (currentN != targetN) {
            final CalculatedPow last = alreadyCalculated.pop();
            if (currentN < targetN) {
                result *= last.value;
                currentN += last.n;
            } else {
                result /= last.value;
                currentN -= last.n;
            }
        }
        return result;
    }


    private static class CalculatedPow {
        private long n;
        private double value;

        public CalculatedPow(long n, double value) {
            this.n = n;
            this.value = value;
        }
    }
}
