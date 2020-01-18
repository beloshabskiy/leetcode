package leetcode.p149;

public class Solution149 {

    public int maxPoints(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        int result = 1;
        for (int i = 0; i < points.length; i++) {
            int repeatedPoints = 1;
            for (int j = i + 1; j < points.length; j++) {
                int currentCount = repeatedPoints + 1;
                int x1 = points[i][0];
                int x2 = points[j][0];

                int y1 = points[i][1];
                int y2 = points[j][1];

                if (x1 == x2 && y1 == y2) {
                    ++repeatedPoints;
                } else {
                    for (int k = j + 1; k < points.length; k++) {
                        int x3 = points[k][0];
                        int y3 = points[k][1];

                        if ((long) (y2 - y1) * (x3 - x1) == (long) (y3 - y1) * (x2 - x1)) {
                            ++currentCount;
                        }
                    }
                }

                result = Math.max(result, currentCount);
            }
        }
        return result;
    }

}
