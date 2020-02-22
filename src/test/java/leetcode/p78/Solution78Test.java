package leetcode.p78;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution78Test {

    @Test
    void subsets() {
        Solution78 underTest = new Solution78();
        final List<List<Integer>> subsets = underTest.subsets(new int[]{1, 2, 3});

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(Collections.emptyList());

        expectedResult.add(Collections.singletonList(1));
        expectedResult.add(Collections.singletonList(2));
        expectedResult.add(Collections.singletonList(3));

        expectedResult.add(Arrays.asList(1, 2));
        expectedResult.add(Arrays.asList(1, 3));
        expectedResult.add(Arrays.asList(2, 3));

        expectedResult.add(Arrays.asList(1, 2, 3));

        final List<List<Integer>> unmatched = expectedResult.stream()
                .filter(it -> subsets.stream().noneMatch(list -> {
                    final List<Integer> tmp = new ArrayList<>(list);
                    Collections.sort(tmp);
                    return tmp.equals(it);
                }))
                .collect(Collectors.toList());
        Assertions.assertEquals(0, unmatched.size(), () -> "Found " + unmatched.size() + " expected results: " + unmatched);
    }
}