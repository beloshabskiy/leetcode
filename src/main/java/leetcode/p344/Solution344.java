package leetcode.p344;

/**
 * 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 */
public class Solution344 {

    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) {
            return;
        }

        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            int oppositeIndex = s.length - 1 - i;
            s[i] = s[oppositeIndex];
            s[oppositeIndex] = tmp;
        }

    }

}
