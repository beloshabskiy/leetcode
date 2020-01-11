package leetcode.p771;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. Jewels and Stones
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class Solution771 {

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSymbols = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelSymbols.add(jewels.charAt(i));
        }

        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelSymbols.contains(stones.charAt(i))) {
                ++result;
            }
        }

        return result;

    }
}
