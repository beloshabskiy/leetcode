package leetcode.p3;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Set<Character> chars = new HashSet<>();
        int i = 0;
        int j = 0;
        int result = 0;

        while (i < s.length()) {
            if (!chars.contains(s.charAt(i))) {
                chars.add(s.charAt(i));
                ++i;
                result = Math.max(result, i - j);
            } else {
                do {
                    chars.remove(s.charAt(j));
                    ++j;
                } while (s.charAt(j - 1) != s.charAt(i));
            }

        }
        return result;
    }
}
