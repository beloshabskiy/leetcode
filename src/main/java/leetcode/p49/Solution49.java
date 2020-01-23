package leetcode.p49;

import java.util.*;

/**
 * 49. Group Anagrams
 * Given an array of strings, group anagrams together.
 */
public class Solution49 {

    public List<List<String>> groupAnagrams(String[] s) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String next : s) {
            groups.computeIfAbsent(encode2(next), k -> new LinkedList<>()).add(next);
        }

        return new ArrayList<>(groups.values());

    }

    private String encode(String s) {
        int[] counts = new int[26];
        for (char next : s.toCharArray()) {
            ++counts[next - 'a'];
        }
        return Arrays.toString(counts);
    }

    private String encode2(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
