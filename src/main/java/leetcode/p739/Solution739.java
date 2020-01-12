package leetcode.p739;

import java.util.Deque;
import java.util.LinkedList;

public class Solution739 {

    public int[] dailyTemperatures(int[] temp) {
        Deque<int[]> waitingForGoodTemperature = new LinkedList<>();
        int[] result = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            int nextTemp = temp[i];
            int[] previous = waitingForGoodTemperature.peek();
            while (previous != null && previous[0] < nextTemp) {
                result[previous[1]] = i - previous[1];
                waitingForGoodTemperature.pop();
                previous = waitingForGoodTemperature.peek();
            }
            waitingForGoodTemperature.push(new int[]{nextTemp, i});
        }
        return result;
    }
}
