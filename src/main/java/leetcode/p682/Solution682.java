package leetcode.p682;

import java.util.LinkedList;

/**
 * 682. Baseball Game
 * You're now a baseball game point recorder.
 * Given a list of strings, each string can be one of the 4 following types:
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * You need to return the sum of the points you could get in all the rounds.
 */
public class Solution682 {

    public int calPoints(String[] ops) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (String next : ops) {
            switch (next) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    stack.push(stack.get(0) + stack.get(1));
                    break;
                default:
                    stack.push(Integer.valueOf(next));
                    break;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
