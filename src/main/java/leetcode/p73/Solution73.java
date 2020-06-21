package leetcode.p73;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 73. Set Matrix Zeroes
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 */
public class Solution73 {

    public void setZeroes2(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows.contains(i) || columns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes(int[][] matrix) {
        boolean setFirstRow = false;
        boolean setFirstColumn = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0) {
                        setFirstRow = true;
                    }

                    if (j == 0) {
                        setFirstColumn = true;
                    }
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (setFirstRow) {
            Arrays.fill(matrix[0], 0);
        }

        if (setFirstColumn) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
