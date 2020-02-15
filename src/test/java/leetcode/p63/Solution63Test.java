package leetcode.p63;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution63Test {

    @Test
    void uniquePathsWithObstacles() {
        Solution63 underTest = new Solution63();
        int[][] input = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
                {1, 1, 0},
        };
        Assertions.assertEquals(2, underTest.uniquePathsWithObstacles(input));
    }

    @Test
    void uniquePathsWithObstacleOnStart() {
        Solution63 underTest = new Solution63();
        int[][] input = {{1, 0}};
        Assertions.assertEquals(0, underTest.uniquePathsWithObstacles(input));
    }
}