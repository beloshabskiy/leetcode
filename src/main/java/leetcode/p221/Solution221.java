package leetcode.p221;

import static java.lang.Math.min;


/**
 * 221. Maximal Square
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 */
public class Solution221 {

    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int result = 0;
        int[] previousRow;
        int[] currentRow = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            currentRow[i] = matrix[0][i] - '0';
            if (currentRow[i] != 0) {
                result = 1;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            previousRow = currentRow;
            currentRow = new int[matrix[0].length];
            currentRow[0] = matrix[i][0] - '0';
            if (currentRow[0] > result) {
                result = currentRow[0];
            }

            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != '0') {
                    currentRow[j] = min(currentRow[j - 1], min(previousRow[j], previousRow[j - 1])) + 1;
                    if (currentRow[j] > result) {
                        result = currentRow[j];
                    }
                }
            }
        }
        return result * result;
    }
}
