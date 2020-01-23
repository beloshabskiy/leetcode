package leetcode.p49;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class Solution49Test {

    @Test
    void shouldHandleBasicScenario() {
        Solution49 underTest = new Solution49();
        List<List<String>> result = underTest.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assertions.assertTrue(contains(result, Arrays.asList("ate","eat","tea")));
        Assertions.assertTrue(contains(result, Arrays.asList("nat","tan")));
        Assertions.assertTrue(contains(result, Collections.singletonList("bat")));
    }

    private boolean contains(List<List<String>> container, List<String> toFind) {
        List<String> sortedToFind = new ArrayList<>(toFind);
        Collections.sort(toFind);
        for (List<String> next : container) {
            List<String> sortedNext = new ArrayList<>(next);
            Collections.sort(sortedNext);
            if (Objects.equals(sortedNext, sortedToFind)) {
                return true;
            }
        }
        return false;
    }

}