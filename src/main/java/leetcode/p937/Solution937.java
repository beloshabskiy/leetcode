package leetcode.p937;

import java.util.ArrayList;
import java.util.List;

/**
 * 937. Reorder Data in Log Files
 * You have an array of logs.  Each log is a space delimited string of words.
 * <p>
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 * <p>
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.
 * <p>
 * Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.
 * <p>
 * Return the final order of the logs.
 */
public class Solution937 {

    public String[] reorderLogFiles(String[] logs) {
        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();

        for (String next : logs) {
            if (isDigitString(next)) {
                digitLogs.add(next);
            } else {
                letterLogs.add(next);
            }
        }

        letterLogs.sort((left, right) -> {
            String[] leftSplit = left.split(" ", 2);
            String[] rightSplit = right.split(" ", 2);
            System.out.println("Compare " + left + " and " + right);
            return (leftSplit[1] + "_" + leftSplit[0]).compareTo(rightSplit[1] + "_" + rightSplit[0]);
        });

        int i = 0;
        String[] result = new String[logs.length];

        for (String next : letterLogs) {
            result[i++] = next;
        }

        for (String next : digitLogs) {
            result[i++] = next;
        }
        return result;
    }


    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean isDigitString(String s) {
        return isDigit(s.charAt(s.indexOf(' ') + 1));
    }
}
